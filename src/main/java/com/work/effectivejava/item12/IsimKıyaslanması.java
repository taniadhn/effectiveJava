package com.work.effectivejava.item12;

import java.util.Comparator;

public class IsimKıyaslanması implements Comparator<Kitap> {


    @Override
    public int compare(Kitap m1, Kitap m2) {
        return m1.getIsim().compareTo(m2.getIsim());
    }
}
