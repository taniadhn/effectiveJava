package com.work.effectivejava.item19;

public class Kus implements UçmaYetisi{


    public void cikSesi(){

        System.out.println("Cik Sesi");

    }

    @Override
    public boolean uçuyorum() {
        return false;
    }
}
