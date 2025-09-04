package com.ar.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {
	public static void main(String[] args) {
		String str = "anurudh   ";
		Map<Character, Long> occuranceOfCh = str.chars().mapToObj(c -> (char) c).filter(c -> !Character.isWhitespace(c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(occuranceOfCh);
		System.out.println();

		String[] s = str.split(" ");
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : ch) {
			if (c != ' ') {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}
}
