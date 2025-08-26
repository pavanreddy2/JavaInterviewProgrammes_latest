package com.ar.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestStringInArray {
    public static void main(String[] args) {
        String[] names = {"java", "python", "programming", "javascript"};

       String longestSting = Arrays.stream(names)
                .max(Comparator.comparing(String::length))
                .orElse("No String found");
        System.out.println(longestSting);

        //Add hypen
        String collect = Arrays.stream(names)
                .collect(Collectors.joining("-"));
        System.out.println(collect);
    }
}
