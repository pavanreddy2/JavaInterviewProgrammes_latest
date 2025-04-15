package com.ar.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        String str = "Anurudh is a good and He is going to hyderabad    ";

      Map<String, Long> occuranceWord =   Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occuranceWord);

        String[] st = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for(String s : st) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s,  1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=="+ entry.getValue());
        }
    }
}
