package com.work.effectivejava.item5;

import java.util.function.Supplier;

public class ItemFiveTest {


    public static void main(String [] args){

    /*

        YaziAnlaliziUtility.isValid();

     */



        Supplier<Sozluk> Türkçe = () -> new Sozluk("Türkçe");

        YaziAnaliziDependency ad = new YaziAnaliziDependency(Türkçe);
        ad.isValid();




        Supplier<String> fs = () -> "Tania";

        System.out.println(fs.get());



        Supplier<String> dahaKısa = ()-> YaziAnlaliziUtility.upuzunKelimekullanıyorumŞuanAklımdaBuVar();

        dahaKısa.get();

        /////

        double randomSayı = Math.random();
        System.out.println(randomSayı);
        System.out.println(randomSayı);

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue);




    }
}
