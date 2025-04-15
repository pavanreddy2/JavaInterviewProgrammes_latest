package com.ar.designPattern.enumSingleton;

public class EnumSingletonEx {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        instance1.getInstance();

        Singleton instance2 = Singleton.INSTANCE;
        instance2.getInstance();
        System.out.println("Both are same?:"+ (instance1 == instance2));
    }
}
