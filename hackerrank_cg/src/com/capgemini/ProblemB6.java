package com.capgemini;

public class ProblemB6 {
	public static void main(String... s) {
		String str = " developer to good";
		char[] chars = str.toCharArray();
		char[] reverse = new char[chars.length];
		int index = 0;
		for (int i = chars.length - 1; i >= 0; i--) {

			reverse[index] = chars[i];
			index++;
		}
		// System.out.println(Arrays.toString(reverse));
		System.out.println(new String(reverse));
	}
}
