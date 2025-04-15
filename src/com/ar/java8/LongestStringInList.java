package com.ar.java8;

import java.util.Arrays;
import java.util.List;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "blueberry");
       String longest = words.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(" ");
        System.out.println(longest);
    }
}
