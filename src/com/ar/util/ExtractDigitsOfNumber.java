package com.ar.util;

public class ExtractDigitsOfNumber {

    //Helper function to extract digits of number.
    public static int[] getDigits (int number){
        int[] digits = new int[4];
        for (int i = 0; i<4; i++) {
             digits[i] = number % 10;
             number /= 10;
        }
        return digits;
    }
}
