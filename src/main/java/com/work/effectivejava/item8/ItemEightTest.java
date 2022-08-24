package com.work.effectivejava.item8;

import java.io.*;
import java.util.Scanner;

public class ItemEightTest {

    private static final int BUFFER_SIZE = 0;

//1
    static String firstLineOfFile(String path)  throws IOException


    {

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {


            return  br.readLine();
        } finally {


            br.close();
        }
    }

    //2

    static String firstLineOfFileWell(String path, String defaultVal)


    {
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            return  br.readLine();

        }catch (IOException e)
        {
            return defaultVal;
        }
    }

    //3
    static void copy(String src, String dst) throws IOException
    {
        try(InputStream in = new FileInputStream(src);
        OutputStream ou = new FileOutputStream(dst))
        {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;

            while (( n= in.read(buf)) >= 0)
                 ou.write(buf,0,n);

        }
    }

    public  static void main(String [] args){


        //try-catch-finally
     //   Scanner scanner = null;
       /* try {

            //Bunu okumaya çalıştım eğer böyle bir dosya uzantısı bulamazsam catch düşerim.
            scanner = new Scanner(new File("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\item8\\test.txt")));

            while (scanner.hasNext())
            {
                System.out.println(scanner.nextLine());
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        finally {
            {
                if(scanner != null)
                {
                    System.out.println("Hello");
                    scanner.close();
                }
            }
        }*/

        //bu bir hatali aritmetiktir
     /*   try
        {

            //aritmetic exception yediğimizde Catch içinde onu göremiyoruz. Burda ben exception handle edemedim. finally içindeki Exception görebiliyorum
            int data = 25/0;
            System.out.println(data);
        }catch (NullPointerException e)
        {
            System.out.println("Patrick");
        }
        finally {
           /// int data = 25/ 0;
            System.out.println("Ben hep çalışırım");
        }
*/

        //Try-catch-finally. exception beklemiyoruz Finally çalışmasını beliyoruz
/*

        try{
            int data = 25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Ben hep çalışırım");
        }
*/

        try{
            int data = 25/0;
            System.out.println(data);
        }catch(ArithmeticException e) {


            System.out.println(e);
        }finally {

            System.out.println("Ben hep çalışırım");
        }


    }
}
