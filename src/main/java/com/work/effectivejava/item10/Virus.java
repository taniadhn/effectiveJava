package com.work.effectivejava.item10;

import com.work.effectivejava.item13.GüvenliKod;

public class Virus {

    public String virus(){


        String virusUrl = "kötüHaber";

        //Bu bir Güvenlik açığıdır. Final dediğimizde tekrardan atama yapılmıyordu ama burda yapıldı. Burda ben Sınırıncı elemana ul
        //ulaştım
        GüvenliKod.ANLAŞMALI_SITELER[0] = virusUrl;

        //kOD BÖYLE ÇAĞIRILABİLİR
        GüvenliKod.haberleriAl(virusUrl);

        return "";
    }
}
