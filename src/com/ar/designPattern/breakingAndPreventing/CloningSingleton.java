package com.ar.designPattern.breakingAndPreventing;

class Singleton implements Cloneable {
    private static Singleton instance = null;
    private Singleton() {
        System.out.println("Single Instance created..");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
/*
     @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone Singleton");
    }
}
public class CloningSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = (Singleton) instance1.clone();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
