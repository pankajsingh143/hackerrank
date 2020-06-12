package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class ProblemB20 {

	public static void main(String[] args) {
		String str = "abbcdbdc";
		countOccurence(str);
	}
	public static void countOccurence(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 1;
		char[] charAr = s.toCharArray();
		for (int i = 0; i < charAr.length; i++) {
			for (int j = 1; j < charAr.length; j++) {
				if (charAr[i] == charAr[j]) {
					// System.out.printf("char: %c i: %d j: %d count %d%n",
					// charAr[i], i, j, count);
					count++;
				} else {
					// count = 1;
				}
			}
			if (count != 1) {
				map.put(charAr[i], count - 1);
			} else {
				map.put(charAr[i], 1);
			}

			count = 1;

		}
		System.out.printf("map " + map);
		int max = 1;
		char c = 'a';
		for (char ch : map.keySet()) {
			if (max < map.get(ch)) {
				max = map.get(ch);
				c = ch;
			}
		}
		System.out.printf("Max occuring char %c , it occurs %d times ", c, max);

	}
	// map.put(charAr[i], count);

}
