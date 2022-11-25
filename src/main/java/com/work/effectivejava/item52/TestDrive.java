package com.work.effectivejava.item52;

public class TestDrive {

    //OverLoading nedir? Aynı isimde methodların farklı parametre almalarına söylenir

   /* public  static  String sınıflandır(Integer a){
        return  "Integer";
    }

    public  static  String sınıflandır(Double a){
        return  "Double";
    }*/

    public static String sınıflandır(Number n)
    {
        return  n instanceof Integer ? "Integer" : n instanceof Double ? "Double":  "Unknown Collection";
    }

    public static void main(String[] args) {
         Number [] numbers =
                 {
                         new Integer(4),
                         new Double(1.1)
                 };
         for(Number number : numbers)
         {
             System.out.println(sınıflandır(number));
         }

        // compile time da belirleniyor. Yanlış yönlendirebilir.
        // It is bad practice to write code whose behavior is likely to confuse programmers
        // Therefore you should avoid confusing uses of overloading.




        // Notes
        // not have to overloaded methods have the same number of parameter


        // ObjectOutputStream

        // create different and specif methods. instead of bunch of write methods; writeLong, writeRead etc..
        //ObjectOutputStream writeInt - writeLong etc.. therefore readInt, readLong etc..

        /*** For constructors, you don’t have the option of using different names: multiple constructors for a class are always overloaded
        constructors can’t be overridden +**/
    }
}
