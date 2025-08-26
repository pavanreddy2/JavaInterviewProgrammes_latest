package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCountInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ab", "xy", "ab", "cb", "cb", "ab", "abcd");
       Map<Long, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(c -> c,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,
                                Collectors.toList())
                ));

        System.out.println(result);
    }
}
