package com.ar.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MissingNumbers {
    public static void main(String[] args) {
        int[] num = {1,2,3,5};

        Set<Integer> set = new HashSet<>();

        for (int i: num) {
            set.add(i);
        }

        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();

        for (int i = min; i<= max; i++) {
            if (!set.contains(i)) {
                System.out.println(i+ " ");
            }
        }

        int n = num.length + 1; // Total numbers supposed to be
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int value : num) {
            actualSum += value;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
