package com.work.effectivejava.item1;

public class FenerBahçe {

    private String yeniFutbolcu;
    private int age;

    public FenerBahçe(String yeniFutbolcu, int age){

        this.yeniFutbolcu= yeniFutbolcu;
        this.age= age;
    }

    public FenerBahçe(String yeniTeknikDirektor){

       this.yeniFutbolcu = yeniFutbolcu;

    }

    //static factory method aynı sınıftan dönmesi lazım
    public static FenerBahçe yeniFutbolcuUret (String yeniFutbolcu){
        return new FenerBahçe (yeniFutbolcu,20);
    }
}
