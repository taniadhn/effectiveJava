package com.work.effectivejava.item21;

public class NonStaticNested {

    private  String sözcük= "Sözcük";

    public class NonStaticNestedClass{

        public void yazBunu()
        {
            //Inner sınıf olduğu için private değişkenine ulaşabiliyorum
            System.out.println(sözcük);
        }
    }
}
