package com.ar.multiThread;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoggingSystem {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads for logging
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Simulate 10 user actions
        for (int i = 1; i <= 10; i++) {
            int actionId = i;
            executor.submit(() -> {
                String logMessage = String.format("User action %d logged at %s by %s",
                        actionId, LocalDateTime.now(), Thread.currentThread().getName());
                // Simulate writing to a file or database
                try {
                    Thread.sleep(500); // Simulate I/O delay
                    System.out.println(logMessage);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown the executor gracefully
        executor.shutdown();
    }
}
