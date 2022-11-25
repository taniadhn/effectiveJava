package com.work.effectivejava.item49;


//NullCheck bizim için yapılmıştı yapılmasaydı nasıl yapılırdı


import java.util.Objects;

public class NullCheck {

    String something;

    //Bunun Constructor yapıyorum java 7 ile gelen notNull işlemini yapıyorum
    public NullCheck(String something){
        //Null kontrolunu gerçekleştiriyor
        this.something = Objects.requireNonNull(something);
    }

    public static void main(String[] args) {
        NullCheck n = new NullCheck(null);
    }


}
