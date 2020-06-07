package com.capgemini;

public class ProblemB2 {

	public static void main(String[] args) {
		String s = "The quick brown  jumps over the lazy dog";

		System.out.println(checkPanagram(s));
		System.out.println(s.indexOf('b'));
	}
	// Panagram is a string having all alphabets
	static boolean checkPanagram(String str) {
		boolean result = true;
		for (char s = 'a'; s <= 'z'; s++) {
			if (str.indexOf(s) <= 0) {
				result = false;
				break;
			}

		}
		return result;

	}
}
