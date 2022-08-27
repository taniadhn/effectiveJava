package com.work.effectivejava.item12;


//Compreable interface  implemente etmemiz sınıfı  instance oluşturduğunuzda bir sıraya sokabilirsiniz kıyaslanabilir hale getiriyorsunuz
public class Kitap implements Comparable<Kitap> {  //Comprable genelde aynı sınıfın Objesi çağrılıyor

    private String isim;
    private int sayfa;

    public Kitap(String isim, int sayfa){

        this.isim = isim;
        this.sayfa = sayfa;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

   @Override
    public int compareTo(Kitap o){

        //Neye göre sıralıyabilirim. Burada Sayfa sayısına göre sıralıyacam
        return this.sayfa - o.sayfa;
    }


    @Override
    public String toString() {
        return "Kitap{" +
                "isim='" + isim + '\'' +
                ", sayfa=" + sayfa +
                '}';
    }


}
