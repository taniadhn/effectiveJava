package com.work.effectivejava.item55;


import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

/***
 * #Optional nedir?
 * Amacınull pointer exceptionları en aza indirgemektedir
 * Null kontrolü yapılmasına gerek kalmaz
 * Yazılım ve okunabiliriği artırmak
 */

public class Max {


    // Returns maximum value in collection - throws exception if empty (Page 249)
    public  static <E extends  Comparable<E>> E max1(Collection<E> c){

        if(c.isEmpty())
            throw new IllegalArgumentException("Empty Collection");

        E result = null;
        for(E e : c)
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
            return result;
    }

    // Returns maximum value in collection as an Optional<E> (Page 250)
    public static <E extends Comparable<E>>Optional<E>  max2 (Collection<E> c){

        if(c.isEmpty())
            return Optional.empty();

        E result = null;
        for(E e : c)
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
            return  Optional.of(result);
    }
}
