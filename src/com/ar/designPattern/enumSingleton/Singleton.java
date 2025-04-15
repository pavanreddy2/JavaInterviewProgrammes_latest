package com.ar.designPattern.enumSingleton;

public enum Singleton {
    INSTANCE;

    public void getInstance() {
        System.out.println("Method in Singleton...");
    }
}
