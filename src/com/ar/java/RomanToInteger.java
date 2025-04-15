package com.ar.java;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("V"));   // Output: 5
        System.out.println(romanToInt("VI"));  // Output: 6
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i>= 0; i--) {
            char c = s.charAt(i);
            int currentValue  = romanMap.get(c);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }
        return total;
    }

}
