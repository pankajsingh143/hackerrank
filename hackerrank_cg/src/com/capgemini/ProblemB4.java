package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class ProblemB4 {

	public static void main(String[] args) {
		Map<Character, Integer> weightMap = new HashMap<Character, Integer>();
		Integer weight = 1;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			weightMap.put(new Character(ch), weight);
			weight++;
		}
		// System.out.println(weightMap);
		String input = "pankaj";
		int sum = 0;
		for (char ch : input.toCharArray()) {
			sum = sum + weightMap.get(new Character(ch));
		}
		System.out.printf("Weight of %s is %d", input, sum);

	}

}
