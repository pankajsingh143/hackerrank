package com.capgemini;

public class ProblemB7 {
	static int n1 = 0, n2 = 1, n3;
	public static void main(String... s) {
		System.out.printf("%d%n %d%n", n1, n2);
		getFib(7);

	}
	// to print fibonacci series 4 -> 0,1,1,2
	public static int getFib(int n) {
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.printf("%d%n", n3);
		}
		return 0;
	}
}
