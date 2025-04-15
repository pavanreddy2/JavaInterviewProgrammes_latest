package com.ar.java;
class Parent {
    //Covariant Return Type
    public Object getValue() {
        return new Object();
    }
    public String getValue1() {
        return "Parent";
    }
}
class Child extends Parent{
    public String getValue() {
        return "Child";
    }
    public String getValue1() {
        return "Child";
    }
}
public class ReturnTypeOverriding {
    public static void main(String[] args) {

    }
}
