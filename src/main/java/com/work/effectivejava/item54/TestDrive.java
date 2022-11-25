package com.work.effectivejava.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {

    private static  final List<Cheese> cheeseInStock = new ArrayList<Cheese>();

    //Kitap diyor ki asla null döndürme. main sınıfında Control eklemek zorundayız
    public static  List<Cheese> getCheeseInStock(){
        return  cheeseInStock.isEmpty() ? null : new ArrayList<>(cheeseInStock);
    }

    //Burada Null döndürmüyoruz Boş liste döndürüyoruz
    public  static  List<Cheese> getCheese(){
        return  new ArrayList<>(cheeseInStock);
    }

    //Ama eğer  diyorsanız ki ben burda birşey oluşturmak istemiyorum eğer boş ise
    public static  List<Cheese> getCheese2(){
        return  cheeseInStock.isEmpty() ? Collections.emptyList():
                new ArrayList<>(cheeseInStock);
    }

    public  Cheese[] getCheese3(){

        //size sıfır olan bir array döndürüyor
        return cheeseInStock.toArray(new Cheese[0]);
    }

    private  static  final  Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
    public Cheese[] getCheese4(){
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }


    public static void main(String[] args) {
        List<Cheese> cheeses = getCheeseInStock();
        if(cheeses != null && cheeses.contains(Cheese.CHEDAR)){
            System.out.println("We have cheese in stock");
        }
    }

    /*
     * In summary, never return null in place of an empty array or collection.
     * It makes your API more difficult to use and more prone to error,
     * and it has no performance advantages.
     */

}
