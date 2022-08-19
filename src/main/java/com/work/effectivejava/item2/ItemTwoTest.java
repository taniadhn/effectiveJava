package com.work.effectivejava.item2;

public class ItemTwoTest {

   public static void main(String[] args) throws Exception {

/***
 Nesneyi üretip içine tek tek parametreleri setledim
 Starbucks sb = new Starbucks();
 sb.setKahveBoyutu("küçük");
 sb.setYumuşatıcı("ekle");
 ***/


//Static methodlara "." kullanarak erişebiliriizz
StarbucksBuilder sb = new StarbucksBuilder.Builder("tall").yumuşakİçenler("ben yumuşak istiyorum").build();
    }
}
