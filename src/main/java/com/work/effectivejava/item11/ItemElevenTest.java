package com.work.effectivejava.item11;

public class ItemElevenTest {

    public static void main(String [] args){

        //Shallow Copy
        Stack st = new Stack();
        Stack st1 = st;  //st bellekteki codunu st1 işliyorum. yani referance eşitliği sağlamış oldum

        System.out.println(st == st1);

        //Deep Copy--Burada bir değer kopyalaması mevcut farklı nesneler arasında
        Stack stc = new Stack();
        stc.stackName = "Tania";
        Stack stc1 = new Stack();
        stc1.stackName = stc.stackName;


    }
}
