package com.work.effectivejava.item5;

import java.util.function.Supplier;

public class YaziAnaliziDependency {

    private final Sozluk sozluk;



    public YaziAnaliziDependency(Supplier<Sozluk> sozluk) {
        this.sozluk = sozluk.get();
    }

    public static  boolean isValid(){

        return  true;
    }
}
