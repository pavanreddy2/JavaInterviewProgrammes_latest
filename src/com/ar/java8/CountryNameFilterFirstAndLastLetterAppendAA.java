package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CountryNameFilterFirstAndLastLetterAppendAA {
    public static void main(String[] args) {

        String[] countries = {null, "Australia", "India", "America", "Malaysia", "Peru"};

        List<String> list = Arrays.stream(countries)
                .filter(Objects::nonNull)
                .filter(s -> {
                   char first = Character.toLowerCase(s.charAt(0));
                   char last = Character.toLowerCase(s.charAt(s.length() - 1));
                    return  first == last;
                })
                .map(s -> s + " AA")
                .collect(Collectors.toList());
        System.out.println(list
        );

    }
}
