package com.ar.java;

import java.util.concurrent.ConcurrentHashMap;

public class SquareStore {
    public static void main(String[] args) {
        int input = 4;
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 1; i<= input; i++) {
            map.put(i, i * i);
        }

        map.forEach((key, value) -> System.out.print(value + " "));
    }
}
