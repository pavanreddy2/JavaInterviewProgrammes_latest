package com.ar.DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {12, 33, 1, 24, 13, 34};
        int target = 33;
        int linear = linearSearch(nums, target);
        if (linear != -1) {
            System.out.println("Linear Search Index is: "+ linear);
        } else {
            System.out.println("Linear Search index is not found...");
        }
    }
    private static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
