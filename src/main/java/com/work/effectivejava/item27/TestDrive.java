package com.work.effectivejava.item27;

import java.util.ArrayList;
import java.util.List;

/**
 * Ana konumuz bir API tasarlarken elimizden geldince en esnek yapıyı tasarlamak
 * Genericler oldukça esnek ve tip güvenli şeylerdi
 * Generikler alt tip ve üst tip bağlantısı yok
 * */
public class TestDrive {


    public static void main(String[] args){

        //PECS: Produce Extend Consumer Super
        List<Object> object1= new ArrayList<Object>();

        //A tipinden generik bir List oluşturdum
        List<? extends A> list;
        list= new ArrayList<A>();

        //? extends dediğimde  B yazabiliyorum. detaylı bir üretim sağlayabiliyorum
        list= new ArrayList<B>();

        /** A B'nin bir üst tipi oldğu halde böyle birşey yapamam
         * ? ben burda bilmiyorum  negelir
        list = new ArrayList<B>();
         */
/**kendinden ve kendinin bir üst türünden üretmeye yarar mesela B B'yı üretebilir ve aynı şekilde A'yıda üretebilir
 * Comprable'da bir kıyaslama yapıyoruz bir şey geri dönüş yapılmıyor SUPER KULLANIYORUZ
 * */
        List<? super B> list2;
        list2= new ArrayList<B>();
    }
}
