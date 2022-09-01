package com.work.effectivejava.item15;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.Date;
import java.util.Locale;

public class TestDrive {


    public static void main( String[] args){
    //mutable
    /**Bir nesne oluşturulduğunda eğer bu objenin değerini değiştirebiliyorsanız bu mutable bir objedir*/

    Date date = new Date();
        System.out.println(date);


        //Bir nesne yaratıldıktan sonra belirli methodlar ile değeri değiştirebiliyorsa  değişebilir bir obje oluyor
     date.setDate(7);  //bir method çağırdım gitti değiştirdi
        System.out.println(date);


        //immutable

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

         //
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate);


    //immutable
    /** Bir Nesne oluşturulsuğunda eğer bu objenin değeri değişmiyorsa bu imutable bir objedir*/

    String isim = new String("Tania");
    //Yaratığım Nesneye bir değişiklik uyguladım ama bir şey olmadı. Hala büyük harfle
        isim.toLowerCase();
        System.out.println(isim.toLowerCase());
        System.out.println(isim);


        //Static factory ile immutable Örneği
        //Boolean
        /*
         * Bir sınıfı tasarlarken public yapıcı metotlar (constructor) yerine statik fabrika metotları kullanmak,
         * daha sonra istemcileri hiç etkilemeden önbellek (cache) eklemenize de olanak sağlar.
         */

        // Immutable kullanım avantajları arasında
        // map yapısında harika bir anahtar görevi görür mantıken hiç değişmediği için..


        // Dezavantaj
        // Immutable objede yeni ufak bir değişiklik için yeni bir nesne yaratmak zorundayız
        // Ancak mutable için böyle bir zorunluluğa gerek yok.

        BigInteger fact = new BigInteger("1");
        System.out.println(fact);
        fact = fact.flipBit(0);
        System.out.println(fact);

        //

        BitSet bits1 = new BitSet(1);
        System.out.println(bits1);
        bits1.flip(0);
        System.out.println(bits1);


        // dezavantaja çözüm
//	    // String builder sınıfında override edilmiş HasCode methodu yok. Rahatlıkla HashCode kullanabiliriz
        //Thread SAfe

        StringBuilder mutableString = new StringBuilder("şimdi mutable olacak");
        System.out.println(mutableString);
        System.out.println(mutableString.hashCode());

        mutableString.setCharAt(7, '@');
        System.out.println(mutableString.toString());
        System.out.println(mutableString.hashCode());

    }
}
