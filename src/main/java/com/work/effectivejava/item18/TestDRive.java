package com.work.effectivejava.item18;


//Bir sınıf birden fazla sınıfı extend edemez

public class TestDRive implements ŞarkıcıŞarkıYazarı{


    @Override
    public void şarkıYaz() {

    }

    @Override
    public void şarkiSöyle() {

    }

    @Override
    public void çalBireyler() {

    }

    public static void main(){

        TestDRive drive = new TestDRive();
        drive.şiirYazabiliyormusun();
    }
}
