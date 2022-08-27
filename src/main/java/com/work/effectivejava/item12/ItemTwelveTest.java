package com.work.effectivejava.item12;

import java.util.ArrayList;

import java.util.Collections;

public class ItemTwelveTest {

    public  static void  main(String [] args){

        ArrayList<Kitap> kitapListesi = new ArrayList<>();
        kitapListesi.add(new Kitap("Tarihi",500));
        kitapListesi.add(new Kitap("Bilgisayar", 250));
        kitapListesi.add(new Kitap("Alef", 250));

        Collections.sort(kitapListesi);  //sort kullanabilmem için Comprable implemente etmem gerekir

        System.out.println("Sıralanma");
        for(Kitap kitap : kitapListesi){
            System.out.println(kitap.toString());
        }

        //Sıralama2

        System.out.println("Sıralama2");
        IsimKıyaslanması ismeGöre = new IsimKıyaslanması();

        Collections.sort(kitapListesi, ismeGöre);
        for(Kitap kitap: kitapListesi){
            System.out.println(kitap.toString());
        }

    }
}
