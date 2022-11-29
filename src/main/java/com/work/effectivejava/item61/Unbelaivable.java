package com.work.effectivejava.item61;

/*
primititive dediğimiz olay: int, double and boolean boxed primitive aslında wraperlar:
Integer, Double, Boolean
 */
public class Unbelaivable {


    //Boxprimitive typelar null değeri alabiliyor ama primitive type null değeri alamıyor
    static Integer i;

    public static void main(String[] args) {


        if (i == 42)
            System.out.println("Unbelievable");


    }
}
