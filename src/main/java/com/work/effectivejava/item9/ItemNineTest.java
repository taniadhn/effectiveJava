package com.work.effectivejava.item9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemNineTest {



  public static void main(String [] args){
/**


      //integer-Type.
      System.out.println( 10==20);

      //char-type.
      System.out.println( 'a'  == 'b');

      //char and double Type
      System.out.println('a' == 97.0);

      //boolean Type-
      System.out.println( true ==true);

      System.out.println((int) 'a');
      System.out.println('a' == 97);
      System.out.println( 'a' +1);
      System.out.println((char) 98);



      //Object kıyasladığımız zaman
      DenemeSınıf  d = new DenemeSınıf(1,2);
      DenemeSınıf  d2 = new DenemeSınıf(1,2);
      System.out.println(d == d2);


      System.out.println(d.equals(d2));
      System.out.println(d.equals(d)); //TRUE dönüyor
 */
/***
      //Part 2

      DenemeSınıf d = new DenemeSınıf(10,11);
      DenemeSınıf d2 = new DenemeSınıf(10,11);

      if(d.equals(d2))
          System.out.println("Biz eşitiz");
          else
          System.out.println("değiliz");
*/


       //part3

      //??Peki Benim Equels Methodundan Beklediğim ne? ve nezaman Override etmem gerekiyor?
      //Equels Methodunu override ettiğimizde bu Özellikleri sağlamamız gerekiyor
      //Reflex: an object must  equal itself x.equals(x) **Default Equal'da bunu sağlıyor**
      //Symetric: Eğer d3 =d4  bu durumda d4 = d3  x.equals(y) must return the same result  as y.equals(x)
      //transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
      //conistent: the value of equals() should change only if a property that is    contained in equal
      // null: control a.equal(null)
/**
      DenemeSınıfOver d3 = new DenemeSınıfOver(10,11);
      DenemeSınıfOver d4 = new DenemeSınıfOver(10,11);

      if(d3.equals(d4))
          System.out.println("Biz eşitiz");
      else
          System.out.println("değiliz");

      System.out.println(d4.equals(d3));
      System.out.println(d3.equals(null));



  /*    DenemeSınıfOver d1 = new DenemeSınıfOver(1,2);
      DenemeSınıfOver d2 = new DenemeSınıfOver(3,4);
      DenemeSınıfOver d3 = new DenemeSınıfOver(1,2);
      System.out.println(d1.hashCode());
      System.out.println(d2.hashCode());
      System.out.println(d3.hashCode());*/




      //HashMap diye bir yapı oluşturduğumuzda

  /*    Map<DenemeSınıfOver, String> m =new HashMap<>();

      //Burda bir PUT operasyonu gerçekleştirdim. Sonra Deneme (1,2) almak istediğimde bana NULL diyor. İşte Bu yüzden Hashcode overide etmem lazım
      m.put(new DenemeSınıfOver(1,2), "ilkEleman"); // ben bunu oluşturdum. Bunun hash Code  "ilkEleman" bu.
      System.out.println(m.get(new DenemeSınıfOver(1,2)));*/



      List<DenemeSınıfOver> list = new ArrayList<>();
      DenemeSınıfOver e = new DenemeSınıfOver(1,2);
      list.add(e);
      System.out.println(list.contains(new DenemeSınıfOver(1,2)));

      List<DenemeSınıf> list1 = new ArrayList<>();
      DenemeSınıf f = new DenemeSınıf(3,4);
      list1.add(f);
      System.out.println(list1.contains(new DenemeSınıf(3,4)));



      //Date Sınıfında Override etmemiz gerekiyor Çünkü bir kıyaslama olabilir ama Random sınıfında gerek yok

  }
}
