package com.ar.collection;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String name: list) {
            if (name.equals("Banana"));
            list.remove(name);
        }
    }
}
