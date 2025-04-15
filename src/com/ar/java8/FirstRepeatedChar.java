package com.ar.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "SSravani";
   Character firstRepeatedChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() != 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeatedChar);
    }
}
