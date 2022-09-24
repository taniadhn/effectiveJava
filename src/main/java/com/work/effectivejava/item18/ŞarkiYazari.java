package com.work.effectivejava.item18;

public interface ŞarkiYazari {

    public void şarkıYaz();

    //Methodu override etmeme gerek kalmıyor direk erişimi sağlıyor.
    default boolean şiirYazabiliyormusun(){
        return  true;
    }
}
