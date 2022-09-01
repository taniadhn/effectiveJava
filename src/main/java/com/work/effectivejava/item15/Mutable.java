package com.work.effectivejava.item15;

public class Mutable extends Immutable{

    private int realValue;

    public Mutable(int value) {
        super(value);
        realValue = value;
    }

    public int getValue() {
        return realValue;
    }

    public void setValue(int newValue) {
        this.realValue = newValue;
    }

    public static void main(String[] args){

        //Değişebilir bir obje yarattım.
       Mutable obj = new Mutable(5);
       //Değişemez bir Obje yaratıp. Yarattım obj buna cast ediyorum
        Immutable immObj = (Immutable) obj;
        System.out.println(immObj.getValue()); //değiştirelemez obj değerini alıyorum
        obj.setValue(8);
        System.out.println(immObj.getValue());
    }
}
