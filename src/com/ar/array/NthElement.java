package com.ar.array;

import java.util.Arrays;
import java.util.Comparator;


public class NthElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int n = 3;

        Integer nthHighest  = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .orElse(null);
        System.out.println(nthHighest);
    }
}
