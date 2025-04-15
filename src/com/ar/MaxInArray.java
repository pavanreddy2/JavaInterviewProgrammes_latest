package com.ar;

import java.util.Arrays;


public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1, 4};
       int max = Arrays.stream(numbers)
                .boxed()
                        .sorted((a,b) -> b - a)
                                .findFirst()
                                        .orElseThrow(() -> new RuntimeException("No value found"));
        System.out.println(max);
    }
}
