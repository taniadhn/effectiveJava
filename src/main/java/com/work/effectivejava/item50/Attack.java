package com.work.effectivejava.item50;

import java.util.Date;

public class Attack {

    public static void main(String[] args) {
        String aklım2 = "brain";

        //Constructor içisinde date olduğu için
        Date start = new Date();
        Date end  = new Date();
        Period p = new Period(start, end, aklım2);
        aklım2.toLowerCase();

        //gidip son end oluşturduğum tarihide değiştiriyor
        end.setYear(40);
        System.out.println(p);


        start = new Date();
        end = new Date();
        p = new Period(start, end, aklım2);
        p.end().setYear(78); // Modifies internals of p!
        System.out.println(p);
    }



}
