package com.ar.main;

public class PolidramCheck {
    public static void main(String[] args) {
        String input = "madam";

        if (isPolidram(input,0,input.length() - 1)){
            System.out.println(input + " is a Polidram");
        } else {
            System.out.println("Is not Polidram");
        }
    }

    public static boolean isPolidram(String str, int left, int right){
        //Base Case
        if (left >= right){
            return true;
        }

        if(str.charAt(left) != str.charAt(right)){
            return false;
        }

        return isPolidram(str,left + 1, right - 1);
    }
}
