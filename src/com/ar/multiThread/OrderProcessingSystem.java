package com.ar.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OrderProcessingSystem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Simulate a cart checkout
        Future<Double> futurePrice = executor.submit(() -> {
            System.out.println("Calculating price on " + Thread.currentThread().getName());
            double basePrice = 100.0; // Cart items total
            double discount = calculateDiscount(basePrice); // Simulate discount API call
            double tax = calculateTax(basePrice); // Simulate tax API call
            double shipping = calculateShipping(); // Simulate shipping API call
            return basePrice - discount + tax + shipping;
        });

        // Main thread continues (e.g., preparing UI)
        System.out.println("Processing order... please wait.");

        // Get the result when ready
        double finalPrice = futurePrice.get(); // Blocks until calculation completes
        System.out.printf("Final price: $%.2f%n", finalPrice);

        // Shutdown the executor
        executor.shutdown();
    }

    private static double calculateDiscount(double basePrice) throws InterruptedException {
        Thread.sleep(1000); // Simulate API call delay
        return basePrice * 0.1; // 10% discount
    }

    private static double calculateTax(double basePrice) throws InterruptedException {
        Thread.sleep(800); // Simulate API call delay
        return basePrice * 0.08; // 8% tax
    }

    private static double calculateShipping() throws InterruptedException {
        Thread.sleep(600); // Simulate API call delay
        return 5.0; // Flat shipping rate
    }
}
