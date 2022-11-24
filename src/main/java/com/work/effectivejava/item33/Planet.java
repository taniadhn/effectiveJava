package com.work.effectivejava.item33;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Planet {

    //Belirli Typelarımız olduğu için onları Enum yaptım
    public  enum LifeCyle{
        ANNUAL, PERENNIAL, BIENNIAL
    }

    //Ben ne zaman bir bitki üretmek istesem onun bir adı ve birde yaşam döngüsü olacak
    final String name;
    final LifeCyle lifeCyle;

    public Planet(String name, LifeCyle lifeCyle){
        this.lifeCyle= lifeCyle;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", lifeCyle=" + lifeCyle +
                '}';
    }

    public static void main(String[] args) {

        //Bilgilerimi iki şekilde tutabilirim bir EnumMap ile birde index Array list olarak
        /**Biz şuan aşağıda ArrayList Kullanmak zorunda kaldık*/
        Planet [] garden = {new Planet("Lale", LifeCyle.ANNUAL), new Planet("Roz", LifeCyle.PERENNIAL),
                new Planet("Shaghayeg", LifeCyle.BIENNIAL), new Planet("Arezoo", LifeCyle.PERENNIAL)};

        // Using ordinal() to index into an array - DON'T DO THIS! (Page 171)

        // Dizilerle genericler uyumlu değiller [Genericler Compile time Tür Güvenliğini sağlar ama diziler Run time tür güvenliğini sağlar]. Kontrolsüz tür dönüştürmek zorunda kalıyoruz.
        // indis sorumluluğu senin üstünde


        /**Generic Yapıda bir Array Listesi yaptığımızı düşünelim*/
        Set<Planet>[] plantsByLifeCycleArr= (Set<Planet>[]) new Set[LifeCyle.values().length];

        ///Her hangi yanlış index kullanımında tek yıllı yaşıyan bitkiyi çok yıllı bitkiye çevirebilirsin.
       // Bunun yerine Enum Map kullanmak daha doğru
        for (int i = 0; i < plantsByLifeCycleArr.length; i++)
            plantsByLifeCycleArr[i] = new HashSet<>();
        for (Planet p : garden)
            plantsByLifeCycleArr[p.lifeCyle.ordinal()].add(p);
        // Print the results
        for (int i = 0; i < plantsByLifeCycleArr.length; i++) {
            System.out.printf("%s: %s%n", LifeCyle.values()[i], plantsByLifeCycleArr[i]);
        }

        System.out.println("----------------");

        //Neden EnumMap kullanıyorum çünkü burda KEY ve VALUE enum
        Map<LifeCyle, Set<Planet>> plantsByLifeCycle = new EnumMap<>(LifeCyle.class);

        // Using an EnumMap to associate data with an enum (Page 172)

        //Values()--> gidip tüm enumlarımızın değerlerini bize döndürüyor
        for (LifeCyle lc : LifeCyle.values())
            //Key'lerimi ekliyorum
            plantsByLifeCycle.put(lc, new HashSet<>());
        //Listeme ekliyorum ve Gruplama yaptığımız yer burası oluyor
        for (Planet p : garden)
            plantsByLifeCycle.get(p.lifeCyle).add(p);

        System.out.println(plantsByLifeCycle);

        // Naive stream-based approach - unlikely to produce an EnumMap! (Page 172)
        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCyle)));

        // Using a stream and an EnumMap to associate data with an enum (Page 173)
        System.out.println(Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCyle, () -> new EnumMap<>(LifeCyle.class), toSet())));

    }

}
