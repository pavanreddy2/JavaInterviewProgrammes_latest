package com.ar.main;

import com.ar.util.ReverseArray;

import java.util.Arrays;

import static com.ar.util.ConvertArrayOfDigitsIntoNumber.convertArrayDigitsIntoNumber;
import static com.ar.util.ExtractDigitsOfNumber.getDigits;
import static com.ar.util.IsValidNumberForkaprekarProcess.isValidNumber;
import static com.ar.util.ReverseArray.reverseArray;

public class KaprekarExample {
    public static void main(String[] args) {

        int number = 8745;
        if (isValidNumber(number)){
            int steps = 0;
            while(number != 6174){
              number = kaprekarPrcess(number);
              steps++;
                System.out.println("stpes: "+ steps + ": "+ number);
            }
            System.out.println("Kaprekar's constant 6174 reached in " + steps + " steps.");
        }
    }

    //function to process in kaprekar
    public static int kaprekarPrcess(int numbers){
        int[] digits = getDigits(numbers);

        //sort digits in asecending order
        Arrays.sort(digits);
        int asceding = convertArrayDigitsIntoNumber(digits);
        //Sort digits in decending order
        reverseArray(digits);
        int decending = convertArrayDigitsIntoNumber(digits);

        return decending - asceding;
    }

}
