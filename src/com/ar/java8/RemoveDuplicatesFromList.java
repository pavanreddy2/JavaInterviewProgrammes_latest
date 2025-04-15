package com.ar.java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,23,11,34,221);
        List<Integer> removeDuplicate =  list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeDuplicate);
    }
}
