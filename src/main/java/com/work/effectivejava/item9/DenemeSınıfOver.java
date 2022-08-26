package com.work.effectivejava.item9;

import java.util.Objects;

public class DenemeSınıfOver {


    private int a,b;


    public DenemeSınıfOver(int a, int b){

        this.a= a;
        this.b =b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        DenemeSınıfOver that = (DenemeSınıfOver) o;

        return a == that.a && b == that.b;
    }

   /* @Override
    public int hashCode() {

        //Böyle yazmak bize çok büyük bir yavaşlık sağlayacak
        return Objects.hash(a, b); //a ve b elemanlarini dönüştür
    }*/


    //Daha hızlı bir method
    @Override
    public  int hashCode(){

        int result = Integer.hashCode(b);

        result = 31*result + Integer.hashCode(a);

        return result;
    }
}
