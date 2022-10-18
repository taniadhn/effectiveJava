package com.work.effectivejava.item23;

import java.util.ArrayList;
import java.util.List;

public class Raw {


    public static void main(String[] args){

        //Sonra gidip String alan listemize böyle belirsiz bir liste ekliyoruz ki içiresine bir obj ekliyoruz
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,Integer.valueOf(42));
        //eklen 42 elemanı String tipinde yazdırıyor
        String s = strings.get(0);
    }

    //Listenin hangi tipte olduğu belli değil
    public static void unsafeAdd(List list, Object o){

        list.add(o);
    }
}
