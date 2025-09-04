package com.ar.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintThreadName {
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("Thread Name: "+ Thread.currentThread().getName());
		};
		
		Thread thread = new Thread(runnable, "Thread-1");
		thread.start();
		
		System.out.println("*******************");
		
		ExecutorService executor = Executors.newFixedThreadPool(6);
		executor.submit(() -> {
			System.out.println("Running in: "+ Thread.currentThread().getName());
		});
		
		executor.submit(() -> {
			System.out.println("Running in: "+ Thread.currentThread().getName());
		});
		executor.shutdown();
	}

}
