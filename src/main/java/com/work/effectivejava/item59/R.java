package com.work.effectivejava.item59;

import java.util.Random;

public class R {

    public static void main(String[] args) {


        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(10));
    }
}
