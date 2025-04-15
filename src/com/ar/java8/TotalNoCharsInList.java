package com.ar.java8;

import java.util.Arrays;
import java.util.List;

public class TotalNoCharsInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

       int totalCount = words.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalCount);
    }
}
