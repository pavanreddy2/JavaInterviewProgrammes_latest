package com.ar.java8;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,11,24,41,44};

        Integer max = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No value is found"));
        System.out.println(max);
    }
}
