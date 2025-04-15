package com.ar;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,7,8,6,10,13};

        Arrays.stream(arr)
                .filter(even -> even % 2 == 0)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Odd Number");
        Arrays.stream(arr)
                .filter(odd -> odd %2 != 0)
                .forEach(System.out::println);
    }
}
