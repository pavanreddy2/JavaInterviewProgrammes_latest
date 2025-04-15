package com.ar.java8;

import java.util.Arrays;
import java.util.List;

public class MissingNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 7,8); // Missing number is 4
        int N = 8; // The maximum number in the range

        System.out.println(missingNumber(numbers, N));
    }

    public static int missingNumber(List<Integer> list, int N){
        int expected = N * (N + 1) / 2;
      int actual =  list.stream().mapToInt(Integer::intValue).sum();

        return expected - actual;
    }
}
