package com.work.effectivejava.item28;

import java.util.List;

public class Dangerous {

    static  void dangerous(List<String>...strinList){


        //Ana Type String'dı ben onun içine bir Integer atadım

        List<Integer> integerList= List.of(42);
        Object[] objects= strinList;
        objects[0] = integerList;  //Heap population

        //Generic type'lar Arrayize edilemez
        String s = strinList[0].get(0);
    }

    public static void main(String[] args) {
         dangerous(List.of("There be dengerous"));
    }
}
