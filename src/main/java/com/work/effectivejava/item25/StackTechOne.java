package com.work.effectivejava.item25;


import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Locale;

//Bunu Generic Tipte yapmam için küçük ve büyük işaretlerini açıp içerisine bir E parametre vermem lazım. Element Type olarak E verecem
//E ne geleceği değil  generic tipte
public class StackTechOne<E> {

    //Karşı taraf ne tipte verirse o tipte bir element array üret diyorum bana. isterse String olsun yada obje
    //Elementımız E tipinde bunun ne olduğu daha belli değil. kullanıcı verecek
    private E[] element;
    private int size =0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public StackTechOne(){

        // The elements array will contain only E instances from push(E).
        // This is sufficient to ensure type safety, but the runtime
        // type of the array won't be E[]; it will always be Object[]!
        element = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];

    }

    public void push(E e){

        capacityEnsure();
        element[size++]= e;
    }

    private void capacityEnsure() {

        if(element.length==size)
            element= Arrays.copyOf(element,2*size +1);
    }

    public E pop(){

        if (size ==0)

            throw new EmptyStackException();
        E result = element[--size];
        element[size]= null;
        return result;

    }

    public  boolean isEmpty(){
        return  size ==0;
    }

    public static  void main(String[] args){

        StackTechOne<String> stack = new StackTechOne<>();

        for( String arg: args )
            stack.push(arg);

        while (!stack.isEmpty())

            System.out.println(stack.pop().toUpperCase());
    }

}
