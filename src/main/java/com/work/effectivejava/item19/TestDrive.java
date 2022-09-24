package com.work.effectivejava.item19;




public class TestDrive {


    public static void main(String[] args){
//Burdan erişebilmemiz kötü birşey çünkü Encapsulation özelliğini hiçe sayıyoruz. Güvenlik açısından bunu böyle kullanmamız lazım
        DenemeSınıf ds= new DenemeSınıf();
//Sadece uçma yetisine sahip kuşları istiyorum. Sadece uçma yetisine sahip sınıfları görebiliyoruz
        //Burada sadece uçuyorum methodunu gördük çünkü bir referance diğer Method görmek için Kendi sınıfından oluşturmamız gerekirdi
        UçmaYetisi uy = new Kus();
        uy.uçuyorum();

    }


}
