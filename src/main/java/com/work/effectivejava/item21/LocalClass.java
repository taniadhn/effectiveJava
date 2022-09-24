package com.work.effectivejava.item21;

//Mantığı sınıfa bir Method içinden erişebilmemiz. Ben Class Metodun içinden erişebilirim

public class LocalClass {

    public void yazBirşeyler(){

        class localInnerClass{


        }

        localInnerClass lc = new localInnerClass();
    }
}
