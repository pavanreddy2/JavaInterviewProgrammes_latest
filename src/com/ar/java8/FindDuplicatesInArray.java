package com.ar.java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 1};

        List<Integer> duplicates = Arrays.stream(array)
                .collect(Collectors.groupingBy(number -> number,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(num -> num.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);

        System.out.println("*****************");
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (Integer in: array) {
            if (!set.add(in)) {
                result.add(in);
            }
        }
        System.out.println(result);
    }
}
