package com.msd.oca8.threads;

public class ThreadJoinDemo extends Thread {
    static int count;

    public static void main(String[] args) {
        // Executing a new Thread Class
        ThreadJoinDemo thread1 = new ThreadJoinDemo();
        thread1.setName("MSD-Thread-1");
        thread1.start();

        // Execute a new Thread Class with Name
        ThreadJoinDemo thread2 = new ThreadJoinDemo();
        thread2.setName("MSD-Thread-2");
        thread2.start();

        // Create a Thread object by passing another thread
        ThreadJoinDemo thread3 = new ThreadJoinDemo();
        Thread mythread = new Thread(thread3, "MSD-Thread-3");
        mythread.start();

        try {
            System.out.println("Going to wait for thread2");
            thread2.join(1000);
            if (thread2.isAlive()) {
                System.out.println("Interrupting thread2 from  - " + Thread.currentThread().getName());
                thread2.interrupt();
                System.out.println("Waiting for thread2 to finish  - " + Thread.currentThread().getName());
                thread2.join();
                System.out.println("Thread2 Completed - " + Thread.currentThread().getName());
            }
            if (thread1.isAlive()) {
                System.out.println("Thread1 is alive");
                thread1.join();
                System.out.println("Thread1 is complete");
            }
            if (thread3.isAlive()) {
                System.out.println("Thread3 is alive");
                thread3.join();
                System.out.println("Thread3 is complete");
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted - " + Thread.currentThread().getName());
        }
        // Print this line only after all threads are done with their tasks
        System.out.println("Done scheduling " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Count before inc " + count + " - " + Thread.currentThread().getName());
        count++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted - " + Thread.currentThread().getName());
        }
        System.out.println("Count after inc " + count + " - " + Thread.currentThread().getName());
    }
}
