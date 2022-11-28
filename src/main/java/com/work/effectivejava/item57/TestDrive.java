package com.work.effectivejava.item57;

import javax.lang.model.element.Element;
import java.util.Iterator;

public class TestDrive {

    /**
     * Minimize the scope of local variables
     * */

    public static void main(String[] args) {
        //iki süslü parntez arasında tanımladığınız değişken yerel değişkendir

        {
            //local variable
            int number = 0;
        }

        ///Number görmüyor çünkü number iki süslü parantez arasında tanımladığım birşey
        ///System.out.println(number);


/*        Iterator<Element> i = c.iterator();
        while(i.hasNext()){
            doSomething(i.next());
        }

        Iterator<Element> i2 = c2.iterator();
        while(i.hasNext()){
            doSomething(i2.next());
        }*/

        //Yükarıdekin çözümü for loop ile mümkün

    /*    for(Iterator<Element> i = c.iterator(); i.hasNext();){
            Element e = i.next();
        }

        for(Iterator<Element> i2 = c2.iterator(); i2.hasNext();){
            Element e2 =i2.next();
        }*/
    }




}
