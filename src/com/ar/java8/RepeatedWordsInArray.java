package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWordsInArray {
    public static void main(String[] args) {
        String[] words =   {"cat", "dog", "Dog", "CAT", "Elephant"};

      List<String> repeatedWords =  Arrays.stream(words)
              .map(String::toLowerCase)
                .collect(Collectors.groupingBy(c -> c,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(repeatedWords);


    }
}
