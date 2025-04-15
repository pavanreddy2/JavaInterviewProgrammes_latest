package com.ar.java8Methods;

public class IntStream {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        java.util.stream.IntStream.range(0, arr.length)
                .forEach(i -> System.out.println("Element of Index: "+ i + ":" + arr[i]));
    }
}
