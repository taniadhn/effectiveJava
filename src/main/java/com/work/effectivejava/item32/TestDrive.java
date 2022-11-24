package com.work.effectivejava.item32;

public class TestDrive {

    public static void main(String[] args) {

        //0000
        //0001 -> 1 iki üzerinden değeri 1 oluyor
        //0010 -> 2 iki üzeri değeri ikidir
        //0011 -> 3
        //x>>1 ---> Anlamı bir tane sağa kaydır demek
        // y>>2 ----> Anlamı iki tane sağa kaydır demek

        int x = -4;
        System.out.println(x>>1);

        int y = 4;
        //0100 --->(iki tane sağa kaydır)0001
        System.out.print("şuan bu ornekteyiz: " );
        System.out.println(y>>2);

        //>>> unsighned operation diye geçiyor. Hepsini sıfıra çevir en sonuncusunu 1 yap
        int xNeg = -1;
        ///111111....1111
        System.out.println(x>>>31); //0000...0001

        //Sola kaydırma operasyonu
        int diff = 2;
        System.out.println(diff<<1);
        System.out.println(1<<2);
    }
}
