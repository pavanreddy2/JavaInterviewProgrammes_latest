package com.ar.array;

import java.util.Arrays;

public class EvenNumberSquare {
    public static void main(String[] args) {

        int[] arr = {1,23,45,12,44,56,11};

       int[] squareEven = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toArray();
        System.out.println(Arrays.toString(squareEven));
    }
}
