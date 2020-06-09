package com.capgemini;

public class ProblemB17 {

	public static void main(String[] args) {
		String s = "AHNHRT";
		getWeight(s);
	}/*
		 * A,I,J,Q,Y - 1 B,K,R-2 C,G,L,S - 3 D,M,T - 4 E,H,N,X -5 U,V,W-6 O,Z-7
		 * F-P-8
		 * 
		 */

	public static int getWeight(String s) {
		int weight = 0;
		int result = 0;
		for (char ch : s.toCharArray()) {
			if (ch == 'A' || ch == 'I' || ch == 'J' || ch == 'Q' || ch == 'Y') {
				weight = weight + 1;
			} else if (ch == 'B' || ch == 'K' || ch == 'R') {
				weight = weight + 2;
			} else if (ch == 'C' || ch == 'G' || ch == 'L' || ch == 'S') {
				weight = weight + 3;
			} else if (ch == 'D' || ch == 'M' || ch == 'T') {
				weight = weight + 4;
			} else if (ch == 'E' || ch == 'H' || ch == 'N' || ch == 'X') {
				weight = weight + 5;
			} else if (ch == 'U' || ch == 'V' || ch == 'W') {
				weight = weight + 6;
			} else if (ch == 'O' || ch == 'Z') {
				weight = weight + 7;
			} else if (ch == 'F' || ch == 'P') {
				weight = weight + 8;
			}
		}
		System.out.println("weight " + weight);
		for (char ch : String.valueOf(weight).toCharArray()) {
			result = result + Character.getNumericValue(ch);
		}
		System.out.println("result " + result);

		return result;
	}

}
