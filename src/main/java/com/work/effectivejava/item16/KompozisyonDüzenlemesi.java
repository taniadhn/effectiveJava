package com.work.effectivejava.item16;

import java.util.HashSet;
import java.util.Set;

public class KompozisyonDüzenlemesi {

    //Bu sefer Extent etmiyoruzda Alan olarak veriyorum
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args){

        set.add("kötü");
        set.forEach(System.out::println);
    }
}
