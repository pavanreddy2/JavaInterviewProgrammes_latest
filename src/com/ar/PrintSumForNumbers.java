package com.ar;

import java.util.Arrays;

public class PrintSumForNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,10};
       int sum = Arrays.stream(numbers)
                .boxed()
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);

        int sum1 = 0;
        for (int num: numbers) {
            sum1 = sum1 + num;
        }
        System.out.println(sum1);
    }
}
