package com.work.effectivejava.item16;


//Inheritence-->Bir sınıf başka bir sınıfın özelliklerini tekrar
// kodlanmaya gerek kalmadan edinmesi diyebiliriz. is ilişkisi örneği: Cat is an animal

//Composition ----> inglizcede is değil'de has ilişkisini temsil eder. mesela kuşun uçma yetisi vardır aynı
// zamanda uçakta uçabilir ama kuş uçak değildir.

//Kütüphane içinde kitaplar olabilir. Bu olması kitapin bazı özelliklerini kullana bilme anlamına gelir. Ama Kitap bir kütüphane değildir .
//Onun için extend yazarsak yanlış olur


import java.util.List;

public class Kütüphane {

    private final List<Kitap> kitaplar;

    //Listedeki kitaplari bir eşleme yolu ile kullanmak istiyorum
    public Kütüphane(List<Kitap> kitaplar) {
        this.kitaplar = kitaplar;
    }
    //Kütüphanedeki tüm kitaplri bana return edecek bir method kullandım
    public List<Kitap> kütüphanedekiTümKitaplar(){

        return  kitaplar;
    }
}
