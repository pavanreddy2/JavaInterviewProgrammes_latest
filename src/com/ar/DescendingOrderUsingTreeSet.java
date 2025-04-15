package com.ar;

import java.util.TreeSet;

public class DescendingOrderUsingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);

        TreeSet<Integer> integers = (TreeSet<Integer>) treeSet.descendingSet();
        for (int desc: integers) {
            System.out.println(desc);
        }
    }
}
