package com.work.effectivejava.item14;

public class Futbol {



    private String takımAdı;
    private int takımOyuncuSayısı;

    public Futbol(String takımAdı, int takımOyuncuSayısı) {
        this.takımAdı = takımAdı;
        this.takımOyuncuSayısı = takımOyuncuSayısı;
    }

    public String getTakımAdı() {
        return takımAdı;
    }

    public void setTakımAdı(String takımAdı) {
        this.takımAdı = takımAdı;
    }

    public int getTakımOyuncuSayısı() {
        return takımOyuncuSayısı;
    }

    public void setTakımOyuncuSayısı(int takımOyuncuSayısı) {
        if (takımOyuncuSayısı < 0){
            System.out.println("error");
        }
        this.takımOyuncuSayısı = takımOyuncuSayısı;
    }
}
