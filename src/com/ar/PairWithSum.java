package com.ar;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

//Time Complexity : O(n) ==> Fast lookup, unique pairs
public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 14;
        findPair(arr, target);
    }

    private static void findPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num: arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair: (" + complement + ", " + num +") ");
            }

            set.add(num);
        }


        IntStream.range(0, arr.length)
                .forEach(i -> {
                    int complement = target - arr[i];
                    if (set.contains(complement)) {
                        System.out.println("(" + complement + ", " + arr[i] + ")");
                    }
                    set.add(arr[i]);
                });
    }
}
