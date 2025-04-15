package com.ar.java;

import java.util.stream.IntStream;

public class BoxingEx {
    public static void main(String[] args) {
        int primitiveType = 100;
        Integer boxed  = primitiveType;
       Integer manualBoxed = Integer.valueOf(boxed);
        System.out.println(manualBoxed);

        IntStream intStream = IntStream.range(1, 5);
        System.out.println(intStream);
    }



}
