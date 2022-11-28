package com.work.effectivejava.item55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestDrive {

    public static void main(String[] args) {

        List<Insan> insan0 = new ArrayList<>(); //Boş Liste
        insan0 =null;

        Insan insan = new Insan();
        insan.setName("Tania");
        insan.setYaş(30);
        List<Insan> insanDolu = new ArrayList<>();
        insanDolu.add(insan);


        Optional<Insan> insan1 = Optional.empty(); //Boş nesnesi var. Optional gittimde bir tane Boş Optional yaratıyor

      ///  Optional<List<Insan> >insan2 = Optional.of(insan0); //of methodu null değer kabul etmiyor
        Optional<List<Insan>> insan3 = Optional.ofNullable(insanDolu); //Null değer kabul ediyor


        String isim = insan3.get().get(0).getName();
        System.out.println("Burası" + isim);
        /*
         * Methods:
         * isPresent() 	null kontorülüdür. Boş ise false, Dolu ise true değerini döndürür.
         * orElse()	kullanici.get().get(0).getName().orElse("Ali"); şeklinde bir şart ile true ya da false değer döndürerek gerekli nesneyi seçebilirsiniz
         * orElseGet()	Nesne içerisinde eğer bir değer null ise varsaydığımız değeri göndeerebiliyoruz.
         * ifPresent()	Eğer null değilse istediğimiz işlemleri ise bu parametre ile yapmaktayız.
         */

        insan3.filter(ad -> ad.get(0).getName().equalsIgnoreCase("Ali"))
                .ifPresent(System.out::println); //Null değilse yazdır

        Integer nullYas = null;
        Integer yas = Optional.ofNullable(nullYas).orElse(30);
        System.out.println(yas);

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        System.out.println(name);



        }


    /**Önemli*/

    public String getUsernameById(List<Insan> insan,int yaş){

        return insan.stream()
                .filter(person -> person.getYaş() == yaş) //yaş bu değerin içerisine al eğer eşit ise alt satırı çalıştır
                .findFirst()
                .map(Insan::getName) //Insan sınıfından getName methodunu çağır
                .orElseThrow(NullPointerException::new); //Eğer böyle birşey olmasa exception çıkar // Burada kendi exceptionununuzu da attırabilirsiniz. InsanNotFoundException gibi
        /***
         * Boş nesne, null değer almayan, null değeride kabul eden nesne
         * */


        /****
         * Notes:
         * if you unable to return value in some cases-> you can return null or throw an exception.
         * 	1) Returning a exception is expensive expensive because the entire stack trace is captured
         * 	2) We talked about null conditions prev. in previous lesson.
         *
         */

    }
}
