package com.work.effectivejava.item64;

import java.util.*;

public class TestDrive {


    public static void main(String[] args) {

        LinkedHashSet<String> stringSet = new LinkedHashSet();




        Set<String> stringSet2 = new LinkedHashSet();
        stringSet2 = new HashSet<>();

        /*
         * neden değişeyim:
         * performans artırımı
         * memory için
         * ek özellikler
         */


        ArrayList<Integer> mPhotos = new ArrayList<Integer>();


        List<Integer> mPhotos2 = new ArrayList<Integer>();
        mPhotos2 = new LinkedList<Integer>();



    }
}
