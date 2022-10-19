package com.work.effectivejava.item31;

public enum OrdinalExample {

    //Demek ki bu belli bir sıra ve hierarchi ilr oluşturuyor
    RED, BLACK, BLUE;

    public static void main(String[] args) {


        System.out.println("Red Ordinal:" + RED.ordinal());
        System.out.println("Black Ordinal:" + BLACK.ordinal());
        System.out.println("Blue Ordinal:" + BLUE.ordinal());
    }
}
