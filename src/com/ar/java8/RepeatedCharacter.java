package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacter {
    public static void main(String[] args) {
      String str = "vvjava";
      Character repeatedChar =  str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(c -> c.getValue() >= 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No character found"));

        System.out.println(repeatedChar);

        List<Character> repeatedChars =  str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(c -> c.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(repeatedChars);
    }
}
