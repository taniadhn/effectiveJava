package com.work.effectivejava.item69HalfOfChapter10;

public class TestDrive {



    // Part1: Exception nedir? -> İstisna
    /*
     * uygulama çalışırken meydana gelen hatalardır.
     *
     * Uygulama komple down olabilir. Hatalar Tolere de edilebilir.
     *
     * Throwable tüm hataların atası: class is the superclass of all errors and exceptions in the Java language.
     * 	Exception ve Error -> Throwable Sınıflarının alt sınıfları.
     * 	Error JVM hataları içeriyor. Biz exception ile ilerlicez.
     *
     *
     *
     *
     */
    public static void main(String[] args) {



        // Part2: Basit Giriş
        try {
            // Kodumuz
        } catch(Exception e) {
            // Hataya müdahale
        } catch(StackOverflowError e2) {
            // Hataya müdehale
        }


        // Part3: Doğru bir exception yakalama
        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try
        {

            System.out.println("try block is started");
            operations.putValue(numbers, 10, 27);
            System.out.println("try block is ended");
            ///7 sizelığında bir eleman ürettim ama 10.ununcu elemanına 27 atamak istedim
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception catched " + ex.toString());
        }
        System.out.println("Ends");


        // Eğer hatayı yönetmeseydik.
//        ArrayOperations operations2 = new ArrayOperations();
//        int[] numbers2 = new int[7];
//        System.out.println("Metot çağırımı");
//        operations.putValue(numbers2, 10, 27);
//        System.out.println("Burayı göremezsin");


        // Farklı bir exception tipi yazsaydık Part3 ilk örnekte dene.



        // Unchecked: Run timeda oluşacak hatar
        // Checked Compiler tarafından kontrol edilen hatalar.(IOException)



        // NOT: Exceptionı her zaman söylediğimiz gibi sadece gerektiğinde kullan!
    }
}
