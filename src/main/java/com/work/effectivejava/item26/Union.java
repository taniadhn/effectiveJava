package com.work.effectivejava.item26;

import java.util.HashSet;
import java.util.Set;

public class Union {


    //Generic Method.--Bu method kullanarak iki kümenin birleşimini alıyoruz. Ama aynı elemanı iki kere yazdırmadan
    // E element temsil ediyor


    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
//Setler iki elemanı birlikte eklemez
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);

        return result;

    }
    // access modifier <conventionlar> dönüşTipi method_name(parameters..)

    //Generic methodumuz her verileni alasında bazı verilen methodu kısıtlamasını istiyorum. Bu sefer T verecem Type geliyor
    public  static<T extends  Number> int topla(T değer1, T değer2){

        return değer1.intValue() + değer2.intValue();

    }

    public static void main(String[] args){

        Set<String> fenerbahçe= Set.of("Alex", "Ali", "Karim", "Mohammad");
        Set<String> türkey = Set.of("Alex", "Ali", "Karim");

        Set<String> birleşim = union(fenerbahçe,türkey);

        System.out.println(birleşim);

        topla(414,587);
    }
}
