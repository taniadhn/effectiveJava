package com.work.effectivejava.item55;

public class Insan {

    public  String name;
    public int yaş;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "name='" + name + '\'' +
                ", yaş=" + yaş +
                '}';
    }

}
