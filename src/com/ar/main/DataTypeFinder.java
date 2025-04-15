package com.ar.main;

import java.util.HashMap;
import java.util.Map;

public class DataTypeFinder {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 123);
        map.put("name", "abc");
        map.put("emp", true);
        map.put("salary", 12345.78);

        for (Map.Entry<String, Object> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " "+ entry.getValue()+ " DataType of Value:"+
                    entry.getValue().getClass().getSimpleName());
        }
    }
}
