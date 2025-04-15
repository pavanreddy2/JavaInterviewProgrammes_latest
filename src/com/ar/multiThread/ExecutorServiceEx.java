package com.ar.multiThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        //Create Thread pool with 2 Threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Submit Task (Runnable)
        for (int i= 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task "+ taskId + "executed By " + Thread.currentThread());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }
}
