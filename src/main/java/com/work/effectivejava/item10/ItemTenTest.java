package com.work.effectivejava.item10;

public class ItemTenTest {

    public static void main(String [] args){

        Request tp = new Request();
        tp.setBody("Stem");
        tp.setHeader("headline");

        System.out.println(tp.toString());
    }
}
