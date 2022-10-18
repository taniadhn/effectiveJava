package com.work.effectivejava.item28;

import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {


    //verilen Array tipte generik dönüyor bana
    static <T> T[] pickTwo(T a, T b, T c){


        switch (ThreadLocalRandom.current().nextInt(3)){

            case 0:
                    return toArray(a,b);
            case 1:
                return toArray(a,c);
                case 2:
            return toArray(b,c);
        }

        throw new AssertionError(); //can't get here

    }

    static <T> T[] toArray(T ...args ){

        return args;
    }
}
