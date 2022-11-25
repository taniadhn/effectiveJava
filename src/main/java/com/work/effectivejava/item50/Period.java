package com.work.effectivejava.item50;

import java.util.Date;

//Immutable sınıf yapıyor. Sınıfımı değiştirmeyen bir nesne oluşturmak istiyorum
//sınıfı final yatım.
public final  class Period {
//Biz ımmutable yapmak istiyoruz ama Date muttable olduğu için değişyor bunun için defansive kopya kullanıyoruz
    private final Date start;
    private  final Date end;

    //Burada String olsaydı sorun yaratmazdı çünkü zaten immutable
    private  final String aklım;

  /*  public Period(Date start, Date end){

        if(start.compareTo(end) > 0)
            throw  new IllegalArgumentException( start + "after" + end);
        this.start= start;
        this.end=end;
    }

    public Date start(){
        return  start;
    }

    public Date end(){
        return  end;
    }
     public  String toString(){

        return  start + "-" + end;
     }*/

    //make defansive copies. Burada değer ataması yaptım yer Constructor demekki Constructor gitmem gerekiyor
    public Period(Date start, Date end, String aklım){

        //günün o anki zamanını alıyordu
        /***
         * start ---> bana gelen kopyayı kendi oluşturduğum kopyaya eşitliyorum. new Date(start.getTime())
         */

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        this.aklım = aklım;
    }
    //Repaire accessors
    public Date start(){
        return new Date(start.getTime());
    }

    public Date end(){

        return  new Date(end.getTime());
    }

    /***
     * Eğer immutable olan şeylerde mutuble şeyler kullanıyorsunuz
     * defensive copies yönteminin kullanmasına dikkat etmeliyiz
     * */
}
