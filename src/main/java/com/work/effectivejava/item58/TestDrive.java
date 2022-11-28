package com.work.effectivejava.item58;

public class TestDrive {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        //Bu array içindeki tüm elemanları dönmek istiyorum

        for(int i=0; i< arr.length; i++){

            System.out.println(arr[i]);
        }

        System.out.println("######");

        /**Integer Type'inda eleman olarak tanımladığım şu Array içinde  parçaları dönecem*/
        for (int eleman : arr) {

            System.out.println(eleman);
            
        }
    }
}
