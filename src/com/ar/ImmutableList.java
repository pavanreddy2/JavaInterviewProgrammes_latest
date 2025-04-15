package com.ar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ImmutableList {
    private final List<String> itemas;
    public ImmutableList(List<String> itemas) {
        this.itemas = new ArrayList<>(itemas);
    }
    public List<String> getItemas() {
        return Collections.unmodifiableList(itemas);
    }
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Apple", "Banana", "Cherry");
        ImmutableList immutableList = new ImmutableList(originalList);

        originalList.add("Date");
        System.out.println("Original List: " + originalList);
        System.out.println("Immutable List: " + immutableList.getItemas());
        // Attempting to modify the immutable map will throw an UnsupportedOperationException
        // immutableMap.getItems().put("Elderberry", 5);
    }

}
