package com.work.effectivejava.item29;

import java.util.HashMap;

public class TestDrive {


    public static void main(String[] args) {

        //TypeSafe: String sorduğunda integer beklemeyezsin
        //Heterojen: Keylerin hepsi farkli tipte olabilir.

        //map örneği.
        HashMap<String, Integer> map = new HashMap<>(); //HashMap içine Key String olmayan başka birşey ekleyemiyorum. Ama ben buraya Heterojen yapmak istediğimde
        //buraya String gelebilir ve ya Integer gelebilir
        map.put("Tania", 24);

     ///   map.put(24,25);  hata veriyor homojen olduğu için

    }




}
