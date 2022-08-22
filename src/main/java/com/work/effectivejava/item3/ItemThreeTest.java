package com.work.effectivejava.item3;

public class ItemThreeTest {

    public static void main (String [] args){




        new Thread(new Runnable() {
            @Override
            public void run() {



                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {

                    }

                System.out.println("HashCode of Lazy:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Instance:" + CacheSingletone.INSTANCE.hashCode());
                }

        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("HashCode of Lazy:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Instance:" + CacheSingletone.INSTANCE.hashCode());

            }
        }).start();

    }
}
