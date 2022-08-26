package com.work.effectivejava.item11;

import java.util.Arrays;
import java.util.EmptyStackException;
// Bizim nesnemizin CLONE yaratıyor. Direk bir şekilde Clone methodu kullanılmıyor

public class Stack implements Cloneable {

    public Object[] element;
    private  int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public String stackName;


    public void finalize(){
        System.out.println("çöpler toplandı");
    }
    public Stack(){


        element = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public void push (Object e){


        ensureCapacity();

        element[size++] = e;
    }



    public Object pop (){

        if(size ==0)
            throw  new EmptyStackException();
        return  element[--size];
    }

    public Object popWell(){

        if(size ==0)
            throw  new EmptyStackException();


        Object result = element[--size];

        element[size] = null;


        return  result;
    }


    private void ensureCapacity() {

        if(element.length == size)
        {
            element = Arrays.copyOf(element, 2 * size +1);
        }
    }

    //Clone  method for class with referance to mutable state
    @Override
    public Stack clone(){

        try{
            Stack result = (Stack) super.clone(); ///,içerisindeki elemanları da Clone yapıyorum
            result.element = element.clone();
            return  result;

        }

         catch (CloneNotSupportedException e) {
           throw new AssertionError();
        }

    }

    public static void main(String [] args) {

        //Yeni bir nesne oluşturduğumuzda bütün ortak methodlara ulaşırız
        Stack stack = new Stack();

        String [] numaralar = { "1","2","3","4"};

        //Bu değerleri stack içine push ediyorum
        for(String arg: numaralar)
            stack.push(arg);
        //Bir tane Copy oluşturuyorum
        Stack copy =  stack.clone();
        
        while(! stack.isEmpty())
            System.out.println(stack.pop() + "");

        System.out.println();
        while (!copy.isEmpty())
            System.out.println(copy.pop()+ "");
            
    }

    private boolean isEmpty() {

        return  size ==0;
    }
}
