package com.work.effectivejava.item27;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {

    private E[] element;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY= 16;

    @SuppressWarnings("unchecked")
    public Stack(){

        element=  (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){

        capacityEnsure();
        element[size++]=e;


    }

    public E pop(){

        if(size==0)
            throw new EmptyStackException();

        E result = element[--size];
        return result;
    }

    private void capacityEnsure() {

        if(element.length==size)
            element= Arrays.copyOf(element, 2*size +1);
    }

    //extends kullanıyoruz ki içerisine herşey kullanabilelim
    public void pushAll(Iterable <? extends E> src ){

        for(E e : src)

            push(e);

    }
}
