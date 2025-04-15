package com.ar.util;

import java.util.Set;

public class FindPolidramCenter {

    /**
     * Expands around a given center to find palindromic substrings.
     *
     * @param input      Input string
     * @param left       Left index of the center
     * @param right      Right index of the center
     * @param palindromes Set to store distinct palindromes
     */
    public static void findPolidramFromCenter(String input, int left, int right, Set<String> palindromes){
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            palindromes.add(input.substring(left, right + 1));
            left--;
            right++;
        }
    }
}
