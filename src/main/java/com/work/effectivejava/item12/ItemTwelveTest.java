package com.work.effectivejava.item12;

import com.work.effectivejava.item13.GüvenliKod;

import java.util.ArrayList;

import java.util.Collections;

public class ItemTwelveTest extends GüvenliKod {

    public  static void  main(String [] args){


        //Ama bu sefer Bu sınıfın içinden bir nesne yaratırım
        ItemTwelveTest it = new ItemTwelveTest();
        it.message2();
        //

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
//Extend edilen sınıflar bunu implemente etmesi lazım
    @Override
    public void message3() {

    }
}
