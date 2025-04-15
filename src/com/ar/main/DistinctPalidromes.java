package com.ar.main;

import java.util.HashSet;
import java.util.Set;

import static com.ar.util.FindPolidramCenter.findPolidramFromCenter;

public class DistinctPalidromes {
    public static void main(String[] args) {
        String input = "ababa";
        Set<String> distinctPalidram = findDistinctPalidram(input);
        System.out.println(distinctPalidram);
    }
    /**
     * Finds all distinct palindromic substrings in the input string.
     *
     * @param input Input string
     * @return Set of distinct palindromes
     */
    public static Set<String> findDistinctPalidram(String input){
        Set<String> palidram = new HashSet<>();
        for (int center = 0; center < input.length(); center++){
            //find odd length palidromes (single character center)
            findPolidramFromCenter(input, center, center,palidram);
            //find even-length palidromes (two character center)
            findPolidramFromCenter(input, center, center + 1, palidram);
        }
        return palidram;
    }

}
