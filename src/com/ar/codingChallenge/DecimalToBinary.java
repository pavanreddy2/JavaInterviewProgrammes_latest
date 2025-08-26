package com.ar.codingChallenge;

public class DecimalToBinary {
    public static void main(String[] args) {

        int num = 7;
      String binaryNumber =  convertToBinary(num);
        System.out.println(binaryNumber);
    }

    public static String convertToBinary(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
           int remainder = num % 2;
           stringBuilder.append(remainder);
           num = num / 2;
        }
        return stringBuilder.reverse().toString();
    }
}
