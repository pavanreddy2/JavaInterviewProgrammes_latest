package com.ar.java.oops;

class A {

}

class B extends A {

}
public class SuperSubClass {
    public static void main(String[] args) {

        A a = new A();
        A a1 = new B();

        /*
        // B b1 = new A();: This line is commented out because it would cause a compile-time error.
        You cannot create a reference of type B and assign it an instance of type A.
         This is because A is not a subclass of B, and thus an A object cannot be treated as a B object (this is known as downcasting, and it is not allowed without an explicit cast,
        which would still fail at runtime if the object is not actually an instance of B).
         */
       // B b1 = new A();
        B b2 = new B();
    }
}
