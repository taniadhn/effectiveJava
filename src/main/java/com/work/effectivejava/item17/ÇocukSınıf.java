package com.work.effectivejava.item17;


//Override edilen bir methodu Constructor kullandığımızda Unutmamamız lazım ki ilk gidip Ana sınıfında Constructor çalıştırıyor sonra
//değer eşitlemesi yapıyor artık değerim42 olarak geldi buraya. Bu bir Bug yol açabilir Bu YÜZDEN:
//Inheritance yapısından Constructor içine kesinlikleoveride edile bilen bir metjhod yapmayın
public class ÇocukSınıf extends AnaSınıf {


    final int değer;

    public ÇocukSınıf(int değer){

        this.değer= değer;
    }

    //Override methodunu override etmek zorundayım abstract olduğu için
    @Override
    public void overrideMe() {

        System.out.println(değer);
    }

    public static void main(String[] args){

        ÇocukSınıf  çocukSınıf= new ÇocukSınıf(42);
    }
}
