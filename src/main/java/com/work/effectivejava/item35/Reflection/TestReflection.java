package com.work.effectivejava.item35.Reflection;

import java.lang.reflect.*;

public class TestReflection {

    /*
     * Reflection(Yansıma), Java Sanal Makinesinde(Java Virtual Machine, JVM)
     *  çalışan uygulamaların, çalışma zamanındaki(runtime) davranışlarını
     *  inceleme ve bu davranışlara yön verme imkanı sağlayan bir özelliktir.
     *  java.lang.reflect API' sinde tanımlanan yansıma özelliği, hata ayıklama(debugging)
     *   ve test araçlarında, görsel yazılım geliştirme ortamlarında kullanılmaktadır.
     */
    public static void main(String[] args) {

        try {
            //Neden Soru işareti kullanıyorum çükü forName içerisinede o tip bir Class dönüyor
            Class<?> sınıf = Class.forName("com.effectivejava.tutorial.effectivejava.itema35.reflection.Metallic");
            Object obj = sınıf.newInstance();
           // Object obj2 = sınıf.getDeclaredConstructor().newInstance();
            Constructor<?> cons = sınıf.getDeclaredConstructor(String.class, Integer.TYPE);

            for (Field field: sınıf.getDeclaredFields())
            {
                //private olduğu halde ismi alabiliyoruz
                System.out.println("Field:" + field.getName());
            }
            System.out.println("Part1 Bitti");
            System.out.println();


            System.out.println("Modifiers:" + cons.getModifiers());
            int modifier = cons.getModifiers();
            System.out.println("Modifer: " + Modifier.toString(modifier));


            System.out.println("Name:" + cons.getName());
            System.out.println("IsAccessible:" + cons.isAccessible());
            System.out.println("IsSynthetic:" + cons.isSynthetic()); // varsayılan başka bir kurucu metodu çağırıyor olması
            System.out.println("IsVarArgs:" + cons.isVarArgs());

            System.out.println("Part2 Bitti");
            System.out.println();

            Method yaşSetle = sınıf.getMethod("setVocalAge", Integer.TYPE);
            //Bu methodu invoke etmek yanı çağırmak
            yaşSetle.invoke(obj, 25);

            Method yaşıAl = sınıf.getMethod("getVocalAge");
            Object age = yaşıAl.invoke(obj);
            System.out.println("Yaş:" + age);

            Method kişiYazdır = sınıf.getMethod("kişiSayısınıYazdır");
            // calling static method with null object
            kişiYazdır.invoke(null);

            // getting the all methods include private with declared methods
            Method yaşArtır = sınıf.getDeclaredMethod("yaşıArtır");
            // accessing to a private method
            yaşArtır.setAccessible(true);
            yaşArtır.invoke(obj);

            Method toString = sınıf.getMethod("toString");
            Object data = toString.invoke(obj);
            System.out.println("Person:" + data);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
