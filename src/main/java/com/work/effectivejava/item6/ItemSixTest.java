package com.work.effectivejava.item6;

import java.util.ArrayList;
import java.util.List;



public class ItemSixTest {
/***
1.state
    private static long topla(){
*yavaşlıkın sebebi bu  şu tipi toplama yapmak için sürekli dönüştürüyor
        Long sum = 0L;
        for (int i= 0; i< 150; i++)
        {
            sum += i;
        }

        return sum;
    }
*/

private static long topla(){

    long sum = 0;
    for(int i=0; i<150; i++)
    {
        sum +=i;
    }
    return sum;
}

    public  static void main(String [] args){

        String kelime = new String("bikini");
        String kelime2 = "bikini";
        String kelime3 = "bikini";

        System.out.println( kelime == kelime2);
        System.out.println(kelime2 == kelime3);

        long start = System.nanoTime();
        topla();
        long end = System.nanoTime();
        topla();

        long totalTime = end -start;
        System.out.println(totalTime);
        //266599
        //4699 2. state. Neden bu kadar uzun sürdüğünü hemen değinelim

        //Autoboxing - unboxing
        ArrayList<Integer> integer = new ArrayList<Integer>();
        for (int i = 0; i< 10; i++){

            integer.add(Integer.valueOf(i));  // Java arka planda bu işlemi yapıyor Integer.valueOf(i)

        }

        List<Integer> li = new ArrayList<Integer>();
        int sum2 =0;
        for(Integer i : li){


            if( i.intValue() % 2 ==0){

            }
        }



    }
}
