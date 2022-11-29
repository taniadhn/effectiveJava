package com.work.effectivejava.item58;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public class DiceRoll {

    enum Face{
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {


        Collection<Face> faces = EnumSet.allOf(Face.class);

        for(Iterator<Face> i = faces.iterator(); i.hasNext();)
            for(Iterator<Face> j = faces.iterator(); j.hasNext();)
                System.out.println(i.next() + "" + j.next());

        System.out.println("#################");

        for (Face f1: faces)
            for(Face f2: faces)
                System.out.println(f1 + "" + f2);
    }
}
