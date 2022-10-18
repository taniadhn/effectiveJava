package com.work.effectivejava.item28;

public class TestDrive {


    //Bu metodun içinde sıfırdan üç'e  kadar parametreleri toplamak istiyorum.
    //iki tane farklı method yazmak zorunda kaldım.
    static void sumTest(int a, int b){


    }

    static void sumTest(int a, int b, int c){


    }

    //Bunu Java vargs ile çözebiliyoruz

    //Bu method içerisine int tipinden hiç veya n tane eleman alacak düzeyde
    //int ...v: bu bizim için bir liste oluşturuyor
    //int ...v bu kullanım her zaman methodun son parametresi olmak zorunda
    static void sumTest(int ...v){

        System.out.println(v.length);
        System.out.println(v[1]);
    }

    public static void main(String[] args) {

     //   sumTest();
        //1 elemanınıda gönderebiliyorum
      //  sumTest(1);
        sumTest(3,2,3);
    }
}
