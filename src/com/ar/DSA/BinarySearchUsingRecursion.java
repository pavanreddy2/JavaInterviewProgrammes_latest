package com.ar.DSA;

import java.util.Arrays;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {

        int[] nums = {1,23,4,55,21,221,3};
        int target = 23;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int binary = binarySearch(nums, target, 0, nums.length - 1);
        if (binary != -1) {
            System.out.println("Binary Search Index: "+ binary);
        } else {
            System.out.println("Binary Search value not found..");
        }
    }

    public static int binarySearch(int[] nums, int target, int left , int right) {
        if (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
}
