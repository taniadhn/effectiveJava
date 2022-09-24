package com.work.effectivejava.item17;

public abstract class AnaSınıf {


    public AnaSınıf(){

        //eğer override edilen metodlar abstract ise gidip abstract sınıfını extend eden methodlar gidip bu sınıfın gövdesini
        //doldurması lazım
        overrideMe();
    }

    public abstract void overrideMe();
}
