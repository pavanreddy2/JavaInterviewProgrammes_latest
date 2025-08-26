package com.ar.array;


import java.util.Arrays;
import java.util.stream.IntStream;



public class MergeArrayWithoutThirdElement {
    public static void main(String[] args) {

        int[] arr1 = {12,31,21,221};
        int[] arr2 = {1,3,11,21};

        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(merged));
    }
}
