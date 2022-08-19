package com.work.effectivejava.item2;

public class StarbucksBuilder {

    //Gerekli
    private String kahveBoyutu;

    //Seçime göre değişir
    private String laktosüzSütMiktari;
    private String yumuşatıcı;



    ///BuilderPattern çözüme şöyle ulaşıyorum

    /**sınıfımızın içinde bir tane static sınıf  oluşturuyorum*/

    public static class Builder{


        //Gerekli
        private String kahveBoyutu;

        //Seçime göre değişir
        private String laktosüzSütMiktari;
        private String yumuşatıcı;


        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        //insanlar belirli option kullanarak başka  kahvelerde üretebilir

        public  Builder laktosuTayfa(String laktosuzSut){

            laktosüzSütMiktari= laktosuzSut;
            return this;
        }

        public  Builder yumuşakİçenler(String yumuşakDeğer) throws Exception{

            /**if() istediğimiz kontrol yapılır**/
            if("".equalsIgnoreCase(yumuşakDeğer)){
                throw new Exception();
            }
            yumuşatıcı =yumuşakDeğer;
            return  this;

        }

        public StarbucksBuilder build()
        {
            return  new StarbucksBuilder(this);
        }




    }
    public StarbucksBuilder(Builder builder) {

        // Bu metodoloji ile değerlerimizi böyle setleyebiliriz
        kahveBoyutu = builder.kahveBoyutu;
        laktosüzSütMiktari = builder.laktosüzSütMiktari;
        yumuşatıcı = builder.yumuşatıcı;

    }

}
