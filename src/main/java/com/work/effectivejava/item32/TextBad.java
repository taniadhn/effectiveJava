package com.work.effectivejava.item32;

public class TextBad {

    public static final int STYLE_BOLD = 1 << 0; //Bold şöyle bir değere atıyım
    public static final int STYLE_ITALIC = 1 << 2;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    public void applyStyle(int styles){

    }

    public static void main(String[] args) {
         TextBad tb = new TextBad();
         tb.applyStyle(1000);
    }
}
