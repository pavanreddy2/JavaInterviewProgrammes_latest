package com.ar.designPattern.doubleLocking;

class Singleton {
    /**
     * volatile: This keyword ensures that changes to the singleton_instance variable are visible to all threads.
     * It prevents the JVM from caching the variable in a way that could lead to one thread seeing a stale value.
     * This is crucial for the double-checked locking pattern to work correctly
     */
    private static volatile Singleton singleton_instance = null;

    private Singleton() {
        System.out.println("Single Instance created..");
    }

    /**
     * First Check (No Lock): The method first checks if singleton_instance is null. If it is null,
     * it means that the instance has not been created yet, and the method proceeds to the synchronized block.
     * This check is done without acquiring a lock to avoid the overhead of synchronization when the instance is already initialized.
     * @return
     */
    public static Singleton getInstance() {
        if (singleton_instance == null) { //First Check (No Lock)
            //This line acquires a lock on the Singleton.class object.
            // This ensures that only one thread can execute the code inside this block at a time.
            // This is necessary to prevent multiple threads from creating multiple instances of the Singleton.
            synchronized (Singleton.class) {
                //Inside the synchronized block, the method checks again if singleton_instance is still null.
                // This is important because another thread may have initialized the instance while the current thread was waiting for the lock.
                // If it is still null, a new instance of Singleton is created.
                if (singleton_instance == null) { // Second check (With Lock)
                    singleton_instance = new Singleton();
                }
            }
        }
        return singleton_instance;
    }
}
public class SingletonDoubleLocking {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println("Both are same?:" + (instance1 == instance2));
    }
}
