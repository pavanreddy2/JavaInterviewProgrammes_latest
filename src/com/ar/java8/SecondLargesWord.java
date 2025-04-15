package com.ar.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargesWord {
    public static void main(String[] args) {
        String str = "I am going to Hyderabad";
        // Split the string into words and create a stream
        String secondLargest = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())//// Sort by length in descending order
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No"));
        System.out.println(secondLargest);
    }
}
