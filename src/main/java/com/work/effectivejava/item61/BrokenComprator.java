package com.work.effectivejava.item61;

import java.util.Comparator;

public class BrokenComprator {

    public static void main(String[] args) {

        Comparator<Integer> naturalOrder0 = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1); //Integer yerine primitive verme şansımız yok

        // Fixed Comparator - Page 274
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // Auto-unboxing
            return i < j ? -1 : (i == j ? 0 : 1);
        };

        int result0 = naturalOrder0.compare(new Integer(42), new Integer(42));
        int result = naturalOrder.compare(new Integer(42), new Integer(42));

        System.out.println(result0);
        System.out.println(result);

    }
}
