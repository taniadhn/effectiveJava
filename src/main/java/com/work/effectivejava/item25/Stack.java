package com.work.effectivejava.item25;

import java.util.Arrays;
import java.util.EmptyStackException;



public class Stack {

    //Bir tane element Obje  arrayım var. Bunun için bu sınıf Generic olmaya müsait
    public Object[] element;
    private int size =0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public void finalize(){

        System.out.println("Çöpler toplandı");
    }

    public Stack(){
        //Constructor bu Capacity göre bir Object array üretiriyordum
        //içerisine push ediyoru ve popWell metoduna göre içrisinden birşey çıkarıyorum


        element= new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public  void push(Object o){

        ensureCapacity();
        element[size++]=o;


    }

    public Object pop(){

        if(size ==0)
            throw new EmptyStackException();

        return element[--size];

    }

    public Object popWell(){

        if(size == 0)
            throw new EmptyStackException();

        Object result = element[--size];
        element[size]= null;

        return result;
    }

    //Eğer push ederken kapasitesi yoksa gidip duruma göre burdan artırıyorum
    private void ensureCapacity() {

        if(element.length== size){
            element= Arrays.copyOf(element, 2*size +1);
        }
    }
}
