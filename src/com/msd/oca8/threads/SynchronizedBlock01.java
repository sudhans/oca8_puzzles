package com.msd.oca8.threads;

public class SynchronizedBlock01 {

    private final Object lock = new Object();
    private int count = 0;
    private final Runnable myRunnable = () -> {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count " + count++ + " - " + Thread.currentThread().getName());
            }
        }
        System.out.println("Completed - " + Thread.currentThread().getName());
    };

    public static void main(String[] args) {
        SynchronizedBlock01 myObj = new SynchronizedBlock01();
        Thread thread1 = new Thread(myObj.myRunnable, "Thread1");
        Thread thread2 = new Thread(myObj.myRunnable, "Thread2");
        Thread thread3 = new Thread(myObj.myRunnable, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Completed - " + Thread.currentThread().getName());
    }

}


