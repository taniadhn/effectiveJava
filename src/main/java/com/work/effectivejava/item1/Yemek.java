package com.work.effectivejava.item1;

public class Yemek {

    String name;




    public static Yemek soğukYemek(String name){

        return new Dondurma();
    }

    public static Yemek sıcakYemek(String name){

        return  new Rice();
    }
}
