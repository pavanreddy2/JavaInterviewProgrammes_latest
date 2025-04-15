package com.ar.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWordInStrings {
    public static void main(String[] args) {
        String[] words =   {"cat", "dog", "Dog", "CAT", "Elephant"};

       List<String> repeatedWord = Arrays.stream(words)
               .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(repeatedWord);
    }
}
