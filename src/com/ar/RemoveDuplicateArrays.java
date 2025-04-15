package com.ar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,2,12,55,11};
        List<Integer> removeDuplicate = Arrays.stream(arr)
                //A stream of primitives (IntStream) is converted into a stream of wrapper objects (Stream<Integer>).
                // This is needed because collections such as lists can only store objects, not primitive types.
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeDuplicate);
    }
}
