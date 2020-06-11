package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class ProblemB27 {

	public static void main(String[] args) {
		String s = "abcnmteh";
		panagramdetector(s);
	}
	public static void panagramdetector(String s) {
		List<Character> missingCharlist = new ArrayList<>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s.indexOf(ch) < 0) {
				missingCharlist.add(ch);
			}
		}
		System.out.println(missingCharlist);
		System.out.println(s.indexOf('a'));
	}
}
