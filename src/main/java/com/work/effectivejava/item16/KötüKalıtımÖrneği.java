package com.work.effectivejava.item16;



//Inheritence dediğimiz olay bir Class başka bir Class özelliklerini tekrar kodlanmaya gerek kalmadan edinmesi diyebilirim. Mesela Kedi bir hayvandır.--> is ilişkisi

//Composisyon --> has ilişkisini kapsar. Mesela kuştan örnek verecek olursak. kuş uçma yeteneği var ama uçakta uçabilir ama kuş bir uçak değildir


import java.util.HashSet;

/** KötüKalıtımÖrneği gidip tüm HashSet Methodlarına ulaşabilir*/
public class KötüKalıtımÖrneği extends HashSet<Object> {

    public static void main(String[] args){

        KötüKalıtımÖrneği kalıtımÖrneği= new KötüKalıtımÖrneği();

        //sırf bu methodu kullanmak için HashSet extend ettim. Bu gidip tüm methodlarına erişiyor bu fazla olan bir şeydır
        //Bunu yaparak Encapsulation bozdum. Sonradan implemetation'da bir şey değiştirme özelliğini bozdum
        //HashSetYapılan bir değişklik yapılırsa direk etkileniyor

        kalıtımÖrneği.add("kötü");


    }


}
