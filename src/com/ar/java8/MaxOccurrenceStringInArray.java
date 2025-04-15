package com.ar.java8;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurrenceStringInArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "cherry", "banana", "apple"};

        String name = Arrays.stream(fruits)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No value found"));
        System.out.println(name);
    }
}
