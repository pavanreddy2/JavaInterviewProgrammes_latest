package com.ar;

import java.util.stream.Collectors;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
/*        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);*/


        // Convert the number to a string, then to a character array, reverse it, and collect it back to a string
        String reversed = String.valueOf(num)
                .chars() // Create an IntStream of characters
                .mapToObj(c -> (char) c) // Convert int to Character
                .sorted((a, b) -> -1) // Sort in reverse order
                .map(String::valueOf) // Convert Character back to String
                .collect(Collectors.joining()); // Join the characters back into a single string

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversed);

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
