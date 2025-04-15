package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonIntegersBothList {
    public static void main(String[] args) {

      List<Integer> list1 =  Arrays.asList(10,2,12,123,53,14,122,5);
      List<Integer> list2 =  Arrays.asList(56,2,12,1,3,4,121);

     List<Integer> common =  list1.stream()
              .filter(list2::contains) /// Keep only elements that are in list2
              .collect(Collectors.toList());
        System.out.println(common);
    }
}
