package com.ar.multiThread;

public class SleepEx {
    public static void main(String[] args) {
        System.out.println("Thread is going to sleep..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Thread Woke up.");
    }
}
