package com.capgemini;

public class ProblemA10 {

	public static void main(String[] args) {
		getNumOfBits(9, 8);
		System.out.println("No of binarybits = " + getNumOfBits(8, 9));
	}
	public static int getNumOfBits(int a, int b) {
		int binary = 0;
		String s = Integer.toBinaryString(a * b);
		System.out.println(s);
		int count = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				count++;
			}
		}
		System.out.println(count);
		if (count == 0)
			return -1;
		return count;

	}

}
