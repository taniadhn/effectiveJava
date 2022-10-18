package com.work.effectivejava.item23;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args ){

        //List String verdğimizde Boolean hata veriyor ve ekletmiyor
        List<String> isimListesi = new ArrayList<>();

        isimListesi.add("Tania");
        isimListesi.add("Haniyeh");
       /// isimListesi.add(Boolean.FALSE);

        String isimAl = isimListesi.get(1);

        System.out.println(isimAl);
    }
}
