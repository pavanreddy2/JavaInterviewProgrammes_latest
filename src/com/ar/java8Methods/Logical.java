package com.ar.java8Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logical {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));

        List<Integer> result = Stream.concat(
                Stream.concat(list1.stream(), list2.stream()),
                list3.stream()
        ).collect(Collectors.toList());

        System.out.println(result);
        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3);

        System.out.println(result);
    }
}
