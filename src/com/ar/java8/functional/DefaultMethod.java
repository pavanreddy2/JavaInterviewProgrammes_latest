package com.ar.java8.functional;

interface I1 {
    default String getGreeting() {
        return "Good Morning!";
    }
}
interface I2 {
    default String getGreeting() {
        return "Good Night!";
    }
}

class C1 implements I1, I2 {
    @Override
    public String getGreeting() {
        return I2.super.getGreeting();
    }
}

public class DefaultMethod {
    public static void main(String[] args) {

        C1 c = new C1();

        System.out.println(c.getGreeting());
    }
}
