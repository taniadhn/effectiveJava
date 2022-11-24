package com.work.effectivejava.item41;

import java.math.BigInteger;

/**
 * Herhangi bir Method oluşturuyorsanız ve bu methodun içinde null beklemediğiniz durumlar var ise
 * Bunu diyor başta kesin ki hem bir hata olsa hemen bu hatanın tespitini yapıp çözün
 * hemde zaman kaybından kaçının
 *
 * */

public class TestDrive {

    public static  void main(String[] args){
       // BigInteger a = new BigInteger("-1");
        mod(null);
    }


    //Bu methodda null kontrol yapılmıyor çünkü BigInteger içindde yapılıyor
    public static BigInteger mod(BigInteger e){
        //Burada mod alırken negatf sayılar istemiyorsunuz
        if(e.signum() <= 0){  //0,-1 ve 1 geri döndürüyor
            throw new ArithmeticException("Modules <= 0:" +e);
        }
        return e;

    }


}
