package com.capgemini;

import java.util.StringJoiner;

public class ProblemB5 {

	public static void main(String[] args) {
		String s[] = {"fakir", "sam", "tonna", "sona"};
		String newAr[] = new String[7];
		int index = 0;
		/// StringBuilder builder = new StringBuilder("{ ");
		StringJoiner joiner = new StringJoiner(",", "{", "}");

		for (String str : s) {
			if (str.startsWith("s")) {
				System.out.println(str);
				joiner.add(str);
			}
			index++;
		}
		System.out.println(joiner.toString());
	}

}
