package com.work.effectivejava.item5;





public class YaziAnaliziSingleton {


    private  static  final Sozluk Türkçe = new Sozluk("Türkçe");
    public  static  YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();

    private YaziAnaliziSingleton(){

    }

    public static boolean isValid(){

        return true;
    }
}
