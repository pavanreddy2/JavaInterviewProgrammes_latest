package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> evenNumbers = list.stream()
			.filter(n -> n %2 == 0)
			.map(n -> n * n)
			.collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
