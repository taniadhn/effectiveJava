package com.work.effectivejava.item27;

import java.util.HashSet;
import java.util.Set;

public class Union<E> {


    //içerisini kalabalıştırmak için  bunun
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){

        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);

        return result;
    }

    public static void main(String[] args){

        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);

        Set<Double> doubles= new HashSet<>();
        doubles.add(3.2);
        doubles.add(4.1);
        doubles.add(4.8);

        Set<Number> numbers= union(doubles,integers);

        System.out.println(numbers);
    }
}
