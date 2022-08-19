package com.work.effectivejava.item2;

public class Starbucks {

    //Gerekli
    private String kahveBoyutu;

    //Seçime göre değişir
    private String laktosüzSütMiktari;
    private String yumuşatıcı;

/***
    //Telescope Pattern
    public Starbucks(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public Starbucks(String kahveBoyutu, String laktosüzSütMiktari) {
        this.kahveBoyutu = kahveBoyutu;
        this.laktosüzSütMiktari = laktosüzSütMiktari;

    }
 **/
/*** ///JavaBean Pattern
    public Starbucks() {
    }

    public void setKahveBoyutu(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public void setLaktosüzSütMiktari(String laktosüzSütMiktari) {
        this.laktosüzSütMiktari = laktosüzSütMiktari;
    }

    public void setYumuşatıcı(String yumuşatıcı) {
        this.yumuşatıcı = yumuşatıcı;
    }
 ***/

   ///Java build Pattern
}
