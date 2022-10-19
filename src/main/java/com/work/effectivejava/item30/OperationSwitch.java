package com.work.effectivejava.item30;

public enum OperationSwitch {

    PLUS, MINUS, TIMES, DIVIDES;
    public double apply(double x, double y){

        switch(this){
            case PLUS: return x+y;
            case MINUS: return x-y;
            case TIMES: return  x*y;
            case DIVIDES: return  x/y;
        }

        throw new AssertionError("unknown op" + this);
    }
}
