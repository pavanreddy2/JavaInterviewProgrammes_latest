package com.ar.util;

public class ConvertArrayOfDigitsIntoNumber {

    public static int convertArrayDigitsIntoNumber(int[] digits){
        int number = 0;
        for (int digit: digits){
            number = number * 10 + digit;
        }
        return number;
    }
}
