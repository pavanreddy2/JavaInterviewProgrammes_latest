package com.ar.string;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        longestCommonPrefix solution = new longestCommonPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geeker", "greek", "geker"};
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("The longest Common Prefix is: " + solution.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        System.out.println("Initial prefix: " + prefix);
        for (int i = 1; i < strs.length; i++) {
            System.out.println("Processing: " + strs[i] + ", current prefix: " + prefix);
            while (strs[i].indexOf(prefix) != 0) {
                System.out.println("  indexOf(" + prefix + ") in " + strs[i] + " = " + strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("  Reduced prefix to: " + prefix);
                if (prefix.isEmpty()) {
                    System.out.println("  Prefix empty, returning ''");
                    return "";
                }
            }
            System.out.println("Prefix after " + strs[i] + ": " + prefix);
        }
        return prefix;
    }
}
