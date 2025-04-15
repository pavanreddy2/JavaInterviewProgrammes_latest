package com.ar.designPattern;

class Singleton {
    /**
     * This variable holds the single instance of the Singleton class.
     * It is declared as static so that it belongs to the class rather than any instance of the class.
     * It is also private to prevent direct access from outside the class.
     */
    private static Singleton singleton_instance = null;

    /**
     * The constructor is private, which means that no other class can create an instance of Singleton
     * using the new keyword
     * . This is crucial for enforcing the Singleton property
     */
    private Singleton() {
    }

    /**
     * This method provides a way to access the single instance of the class.
     * It checks if singleton_instance is null (i.e., if the instance has not been created yet).
     * If it is null, it creates a new instance of Singleton. If it is not null, it returns the existing instance.
     * This method is the only way to get the instance of the Singleton class.
     * @return
     */
    public static Singleton getInstance() {
        if (singleton_instance == null) {
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }
}
public class SingletonDP {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
