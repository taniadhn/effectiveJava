package com.work.effectivejava.item35.Reflection;

public class Metallic {

    public final static int KIŞI_SAYISI =4;
    private String vocalName;
    private int vocalAge;

    public Metallic() {
        // TODO Auto-generated constructor stub
        this("James", 59);
    }

    public Metallic(String vocalName, int vocalAge){
        this.vocalName= vocalName;
        this.vocalAge=vocalAge;
    }

    public String getVocalName() {
        return vocalName;
    }

    public void setVocalName(String vocalName) {
        this.vocalName = vocalName;
    }

    public int getVocalAge() {
        return vocalAge;
    }

    public void setVocalAge(int vocalAge) {
        this.vocalAge = vocalAge;
    }

    private void yasıArtır(){
        ++vocalAge;
    }

    public  static void kişiSayısınıYazdır(){
        System.out.println("No_"+ KIŞI_SAYISI);
    }

    @Override
    public String toString() {
        return "Metallic{" +
                "vocalName='" + vocalName + '\'' +
                ", vocalAge=" + vocalAge +
                '}';
    }
}
