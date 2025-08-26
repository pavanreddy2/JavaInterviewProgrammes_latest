package com.ar.codingChallenge;

public class PrimaryCheck {
    public static void main(String[] args) {

        int num = 6;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; // 0, 1 are not prime
        } else {
            for (int i = 2; i <= num /2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime Number");
        } else {
            System.out.println(num + " is not prime Number");
        }
    }
}
