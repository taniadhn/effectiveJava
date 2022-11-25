package com.work.effectivejava.item50;


import java.util.Date;

/***
 * Immutable---> siz bir nesne oluşturduğunuz zaman üstünde işlemler yapmasına rağmen
 * nesnenin değişmemesi olayı. String bir immutable nesnedir(final sınıftır)
 *
 * Muttable ---> üstünde işlemler yapılınca nesnenin değişmesi durumu
 *
 */

public class TestDrive {


    public static void main(String[] args) {

        //immutable örneği

        String name = "Tania";
        //String sınıfı ile birlikte benim kullanabildiğim bir sürü method geliyor

        System.out.println(name.toUpperCase());
        System.out.println(name);


        //mmutable

        Date tarih = new Date();
        System.out.println(tarih);
        tarih.setYear(122222);
        System.out.println(tarih);

    }

}
