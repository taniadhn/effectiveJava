package com.work.effectivejava.item58;

public class TestDrive {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        //Bu array içindeki tüm elemanları dönmek istiyorum

        for(int i=0; i< arr.length; i++){

            System.out.println(arr[i]);
            if(arr[i] == 2)
            {
                //listedeki elemanlarda değişiklik yapmak için kullanılır
                arr[i] = 2+3;
            }
        }

        System.out.println("######");

        /**Integer Type'inda eleman olarak tanımladığım şu Array içinde  parçaları dönecem*/
        //sadece ileriye dönük çalışmak istesem foreach benim için uygundur
        for (int eleman : arr) {

            System.out.println(eleman);
            
        }
    }
}
