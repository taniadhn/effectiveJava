package com.work.effectivejava.item15;


/**Normalde bir Immutable sınıf oluşturmak istediğimizde final olmak zorunda*/
public class Immutable {

    //Oluşturduğumuz değerlerde private ve final değerlerinede ihtiyaçları vardır.
    //final tekrardan değer ataması için
    //private dışardan erişimi kapatıyor
    private  final int value;

    public int getValue() {
        return value;
    }

    public Immutable(int value) {
        this.value = value;
    }

    //read only. dışarıdan değiştiremiyorum
}
