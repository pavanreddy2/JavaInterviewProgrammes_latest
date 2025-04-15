package com.ar.java8;

import java.util.Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 7, 6, 8, -2};
        int b = 3;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum sum of subarray of size " + b + " is: " + findMaxSum(arr, b));
    }

    public static int findMaxSum(int[] arr, int b) {
        if (arr.length < b) {
            throw new IllegalArgumentException("Subarray size b cannot be greater than array length.");
        }

        int maxSum = Arrays.stream(arr,0,b).sum();
        int currentSum = maxSum;

        for (int i = b; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - b];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

