package com.ar.java8;

import java.util.Scanner;
import java.util.stream.Collectors;

public class KapreparEx {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a four-digit number: ");
            int number = scanner.nextInt();

            if (isValidNumber(number)) {
                int steps = 0;

                while (number != 6174) {
                    number = kaprekarProcess(number);
                    steps++;
                    System.out.println("Step " + steps + ": " + number);
                }
                System.out.println("Kaprekar's constant 6174 reached in " + steps + " steps.");
            } else {
                System.out.println("Invalid input! Enter a four-digit number with at least two different digits.");
            }
            scanner.close();
        }

        // Kaprekar process implementation
        private static int kaprekarProcess(int number) {
            String numberStr = String.format("%04d", number);

            // Create ascending order
            String ascendingStr = numberStr.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .sorted()
                    .collect(Collectors.joining());

            // Create descending order
            String descendingStr = new StringBuilder(ascendingStr).reverse().toString();

            int ascending = Integer.parseInt(ascendingStr);
            int descending = Integer.parseInt(descendingStr);

            return descending - ascending;
        }

        // Validation for a four-digit number with at least two different digits
        private static boolean isValidNumber(int number) {
            if (number < 1000 || number > 9999) {
                return false;
            }

            String numberStr = String.valueOf(number);
            long uniqueDigits = numberStr.chars()
                    .distinct()
                    .count();

            return uniqueDigits > 1; // Ensure there are at least two different digits
        }
    }
