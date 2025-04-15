package com.ar.DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {12,1,121,32,3,23,44,14};
        int size = nums.length;
        int temp = 0;
        System.out.print("Before Sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After Soring ");
        for (int num: nums) {
            System.out.print(num+ " ");
        }
    }
}
