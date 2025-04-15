package com.ar.array;

import java.util.Arrays;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        int[] num = {11,12,3,115};

        int min = Arrays.stream(num)
                .max()
                .orElseThrow(() -> new RuntimeException("No number found"));
        System.out.println(min);
    }
}
