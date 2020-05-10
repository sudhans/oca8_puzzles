package com.msd.oca8.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock01 {

    private final Lock lock = new ReentrantLock(true);
    private int count = 0;
    private final Runnable myRunnable = () -> {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count " + count++ + " - " + Thread.currentThread().getName());
            }
        } finally {
            System.out.println("Completed - " + Thread.currentThread().getName());
            // Unlock statement is always called in the finally block to ensure the lock is released even if an exception is
            // thrown in the method 
            lock.unlock();
        }
    };

    public static void main(String[] args) {
        ReentrantLock01 myObj = new ReentrantLock01();
        Thread thread1 = new Thread(myObj.myRunnable, "Thread1");
        Thread thread2 = new Thread(myObj.myRunnable, "Thread2");
        Thread thread3 = new Thread(myObj.myRunnable, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Completed - " + Thread.currentThread().getName());
    }

}


