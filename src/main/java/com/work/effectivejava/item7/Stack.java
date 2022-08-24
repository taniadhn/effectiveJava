package com.work.effectivejava.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    public Object[] element;
    private  int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;



    public void finalize(){
        System.out.println("çöpler toplandı");
    }
    public Stack(){


        element = new Object[DEFAULT_INITIAL_CAPACITY];
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
}
