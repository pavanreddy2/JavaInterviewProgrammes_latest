package com.ar.java8Methods;

import java.util.Arrays;
import java.util.List;

public class ParallerExecution {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.parallelStream()
                .map(n -> {
                    System.out.println(Thread.currentThread().getName() + "Processing: "+ n);
                    return n*2;
                })
                .forEach(System.out::println);
        System.out.println("Done.");
    }
}
//parallelStream(): Creates a parallel stream, splitting the work across multiple threads (using the Fork/Join pool).
//map(): Doubles each number and prints the thread name to show multiple threads at work.
//forEach(): Prints the results (order not guaranteed).
//Observation: Multiple threads (e.g., ForkJoinPool.commonPool-worker-X) process elements concurrently.
// The order of output is unpredictable because threads run in parallel.