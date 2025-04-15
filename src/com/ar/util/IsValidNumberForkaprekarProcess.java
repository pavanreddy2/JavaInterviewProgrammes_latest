package com.ar.util;

import static com.ar.util.ExtractDigitsOfNumber.getDigits;

public class IsValidNumberForkaprekarProcess {

    public static boolean isValidNumber(int number){
        if (number < 1000 || number > 9999) {
            return false;
        }
        int[]  digits =  getDigits(number);
        return !(digits[0] == digits[1] && digits[1] == digits[2] && digits[2] == digits[3] && digits[3] == digits[4]);
    }
}
