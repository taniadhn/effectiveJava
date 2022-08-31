package com.work.effectivejava.item13;


/**
 * Abstract Sınıf'ların nesnesi oluşturulamaz
 * Abstract Methodların Gövdesi olmaz.
 * Abstract Methodlarını Extend Edebilirim
 *
 * */

public abstract class GüvenliKod {

 /**   public static final String [] ANLAŞMALI_SITELER = new String[]{"http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com" };*/
    //Kitap bunun için Şey diyor Public Private yapın
    public static final String [] ANLAŞMALI_SITELER = new String[]{"http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com" };

    public static void haberleriAl(String url){

        for(String haberler :ANLAŞMALI_SITELER)
            if (url.equals(haberler));


    }

    /** Bir Method Yada Parametre Eğer "Private" access modifier alırsa Sadece kendi sınıfında erişilebilir
     * doarıdan erişilemez.
     * Öreniği a method olarak verilmektedir
     * */

    private String asd = "";


    private void message(){

        System.out.println("Shahbanoo");
    }
//Private olanilir method
    public String a(){

        message();
        return asd;
    }

    //Public

    public void message1(){
        System.out.println("Shah");
    }

    //Protected
    //Sadece Aynı paket içinden erişebilirim.
    /**Ama Eğer başka pakete gidip EXTEND yaptığımızda erişebilirim*/

    protected  void message2(){
        System.out.println("shahzdeh");
    }

    public static String a = "a";

    //eğer bir parametre final olursa ben ona erişebilirim ama  miktarını değiştiremem. bir şey Final ise tekrar
    //değer ataması yapamayız.
    //Aynı şekilde bir method Final ise override edilemez
    //Bir sınıf final ise Sınıf Extend edilemez.
    public static final String ba = "b";

    public abstract void message3();
}
