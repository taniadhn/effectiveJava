package com.work.effectivejava.item25;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Locale;

public class StackTechTwo<E> {

    //eğer @SuppressWarning attırmak istemiyorsanız element bırakın obje tipinde kalsın
    private Object[] element;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;

    public StackTechTwo(){
        element=  new Object[DEFAULT_INITIAL_CAPACITY];
    }


    public boolean isEmpty(){

        return size==0;
    }
    //Ama burda verilen tipte operasyon yapması lazım onun için E kullanıyoruz
    public void push(E e){
        ensureCapacity();
        element[size++]= e;
    }

    private void ensureCapacity() {

        if(element.length==size)

            element= Arrays.copyOf(element, 2*size+1);
    }

    public E pop(){

        if(size ==0)
            throw  new EmptyStackException();

        @SuppressWarnings("unchecked")
        E result = (E) element[--size];
        return result;
    }

    public static  void main(String[] args){

        StackTechTwo<String> stack = new StackTechTwo<>();

        for(String arg: args)
            stack.push(arg);

        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
    }
