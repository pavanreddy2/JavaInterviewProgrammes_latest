package com.ar.java.oops;

public class MethodOverridingDifferentTypes {
    static void method(Integer i) {
        System.out.println(1);
    }
    static void method(Double d) {
        System.out.println(2);
    }

    static void method(Number n) {
        System.out.println(4);
    }

    static void method(Object o) {
        System.out.println(5);
    }
    public static void main(String[] args) {
        method((short)2);
    }
}

/*
Step-by-step Resolution:
(short)2 is a primitive short.

Java does not find an exact method method(short), so it tries other options.

Now it looks for:

Widening to another primitive: Not possible, no method(int) now.

Boxing: short gets boxed to Short (wrapper class).

Then it checks which method Short can be passed to:

method(Integer) – ❌ not compatible (Short ≠ Integer)

method(Double) – ❌ not compatible

method(Number) – ✅ YES! Short is a subclass of Number

method(Object) – ✅ but Number is more specific than Object


 */