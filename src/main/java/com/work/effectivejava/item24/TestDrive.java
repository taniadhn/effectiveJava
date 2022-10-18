package com.work.effectivejava.item24;


//Diziler ve listeler arasında bir farka değinmiş

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args){


        //Buradsa bir obje oluşturdum. Bunu çalıştırdığımda hata alıyorum. Çünkü Kökü Obje olan String verebiliriz
        //Buda çalışma anında bize Runtime hatası getirebilir
       // Object[] objectArray = new Long[1];
     //   objectArray[0]= "Kadın=erkek";

        /**
        /**Generic Listler Compile time tür güvenliği sağlıyorlar
        List<Object> ol = new ArrayList<Long>();  //uyumsuz türler bana hatasını verir. Burda yükaridaki gibi
        //superClass ilişkisi yok

         //Buraya Obj dedisem burayada Obj demem gerekiyor
         List<Object> ol = new ArrayList<Object>();
         ol.add(1L);

         Genericleri Arraylere tercih etmeliyiz
        */
    }
}
