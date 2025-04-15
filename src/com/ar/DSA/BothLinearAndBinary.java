package com.ar.DSA;

public class BothLinearAndBinary {
    public static void main(String[] args) {
        int[] nums = {12, 33, 1, 24, 13, 34};
        int target = 33;
    }

    private static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
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
