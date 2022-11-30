package com.work.effectivejava.item78;

import java.util.concurrent.TimeUnit;

public class StopThread1 {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1); // Change and try

        stopRequested = true;

    }

}
