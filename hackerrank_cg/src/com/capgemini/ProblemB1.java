package com.capgemini;

public class ProblemB1 {

	public static void main(String[] args) {
		String ip = "cat-ac";
		boolean anargra = isAnargram(ip);
		System.out.println(anargra);
	}
	public static boolean isAnargram(String s) {
		String[] sar = s.split("-");
		boolean result = false;
		for (char ch : sar[0].toCharArray()) {
			System.out.printf("%c %d", ch, sar[1].indexOf(ch));
			if (sar[1].indexOf(ch) < 0) {
				result = false;
			} else {
				result = true;
			}
		}
		return result;
	}

}
