package com.work.effectivejava.item13;

public class ItemThirteenTest {

    public static void main(String[] args){


        //Bunun üzerinden Message erişemiyorum. Çünkü methodum Private şekilde tanımlanmış
        GüvenliKod gk = new GüvenliKod() {
            @Override
            public void message3() {

            }
        };

        //Public olduğu zaman bunun methoduna ulaşabilirim.
        gk.message1();

        //Başka paketten erişme yasağı vardır ama kendi paketinden erişebiliyorum
        gk.message2();



    }
}
