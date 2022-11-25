package com.work.effectivejava.item51;

import java.util.Collection;

public class TestDrive {

    public int sum (int a , int b)
    {
      //  if()
       // b = b*4;bu işlemi gidin başka bir yere taşıyın
        return a+b;
    }
    /***
     * Method isimlerini düzgün seçmelisin
     * Solid prensibine uy (Burda sadece S uyacağız: Bir method bir iş yapsın . bir sınıf birşeyden sorumlu olsun )
     * method en fazla 4 parametre alacak şekilde dizayn edilmelidi
     *
     * Boolean yerine 2 elemanlı enumlar kullanabilirsin. termometre örneği
     */

    public static void main(String[] args) {

        boolean isCelcius = false;
        if(isCelcius)
        {
            System.out.println("Evet.");
        }
        else //fahrenay
        {

        }

        //yarın  Clevin de gelebilir. yukarıdaki yapı bun zorlaştırır
      ///  yerine Enum kullanmalıyız

        TemperatureScale value = TemperatureScale.FARENHAIT;
        if(TemperatureScale.CELSİUS == value){

            //TODO
        }





    }

}
