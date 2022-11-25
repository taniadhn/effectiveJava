package com.work.effectivejava.item53;

public class Varags {

    public static int sum(int... args){

        int sum=0;
        for(int arg: args)
            sum += arg;
        return  sum;
    }

    //Wrong way
  /*  public  static  int min(int...args){
        if(args.length ==0)
            throw  new IllegalArgumentException("Too few arguments");
        int min = args[0];
        for (int i=1; i< args.length; i++)
            if(args[i] < min)
                min = args[i];
        return  min;
    }*/

    // The right way to use varargs to pass one or more arguments (Page 246)
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(min(1,2,3,4));
    }


}
