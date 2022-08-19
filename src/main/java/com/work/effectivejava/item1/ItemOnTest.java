package com.work.effectivejava.item1;

public class ItemOnTest {

    public static void main(String[] args){
        /** Böyle yazıldığında new yemek dediğimizda cCONSTRUCTOR Parametre olarak soğuk
         *  yemek yazdığımız için bize soğuk veriyor ve bunu
         * Yemek sınıfına gitmeden öğrenmemiz mümkün değil
        Yemek yemek = new Yemek(soğuk)
         ----- onun yerine aşağıdaki gibi kullanıyoruz-----
**/

        /** ismili CONSTRUCTOR oluşturuyoruz
        Yemek yemek = Yemek.sıcakYemek(name);****/

        FenerBahçe fb = FenerBahçe.yeniFutbolcuUret("Ronaldo");


    }
}
