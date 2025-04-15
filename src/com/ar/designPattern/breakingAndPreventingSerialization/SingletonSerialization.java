package com.ar.designPattern.breakingAndPreventingSerialization;

import java.io.*;

class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;
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
    // This method ensures that the same instance is returned during deserialization
    protected Object readResolve() {
        return instance;
    }
}
public class SingletonSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
        // Serialize the instance
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize the instance
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        System.out.println("Instance 2 HashCode: " + instance2.hashCode());
        System.out.println("Are both instances the same? " + (instance1 == instance2));

    }
}
