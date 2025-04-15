package com.ar.main;

import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "How are you not well?";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);

        //Using java8;
        String reversed = IntStream.rangeClosed(1, str.length() - 1)
                        .mapToObj(i -> str.charAt(str.length() - i))
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append)
                                        .toString();
        System.out.println(reversed);
    }
}
