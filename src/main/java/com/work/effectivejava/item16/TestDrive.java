package com.work.effectivejava.item16;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args){


        KötüKalıtımÖrneği kötü = new KötüKalıtımÖrneği();

        //Tüm hashset methodlara ulaşıyorum
     ///   kötü.

Kitap kitap1 = new Kitap("Amerka tariki");
Kitap  kitap2 = new Kitap("DEvrenimiz");
        List<Kitap>  kitapListesi = new ArrayList<Kitap>();

        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);

Kütüphane kütüphane = new Kütüphane(kitapListesi);

List<Kitap> KütüphanedekiKitaplar = kütüphane.kütüphanedekiTümKitaplar();

for(Kitap kitap: KütüphanedekiKitaplar)
{
    System.out.println(kitap.getIsim());
}



    }
}
