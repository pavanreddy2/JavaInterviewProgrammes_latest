package com.ar.java8Methods;

import java.util.Arrays;
import java.util.List;

public class SequantialAndParallerStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sequential Execution:");
        numbers.stream()
                .map(n -> {
                    System.out.println(Thread.currentThread().getName() + "processing: "+n);

                    return n*2;
                })
                .forEach(System.out::println);
        System.out.println("Done. ");
    }
}
//map(): Doubles each number and prints the thread name to show it’s all one thread.
//Observation: All processing happens in the main thread, one element at a time, in order.