package com.ar.DSA;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,23,4,55,21,221,3};
        int target = 55;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       int binary = binarySearch(nums, target);
       if (binary != -1) {
           System.out.println("Binary Search Index: "+ binary);
       } else {
           System.out.println("Binary Search value not found..");
       }
    }
    private static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
