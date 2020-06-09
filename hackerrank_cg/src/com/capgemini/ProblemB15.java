package com.capgemini;

public class ProblemB15 {
	public static boolean checkStrongNumber(int n) {
		boolean result = false;
		int sum = 0;
		for (char ch : String.valueOf(n).toCharArray()) {
			System.out.printf("factorial of %d is %d ",
					Character.getNumericValue(ch),
					getFactorial(Character.getNumericValue(ch)));
			sum = sum + getFactorial(Character.getNumericValue(ch));
		}
		System.out.println("sum " + sum);
		if (sum == n) {
			result = true;
		}
		return result;
	}
	public static int getFactorial(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
			// System.out.printf(" n: %d fact: %d", fact, n);
		}
		return fact;
	}

	public static void main(String... s) {
		int n = 145;
		checkStrongNumber(n);
		System.out.println("No is strong number " + checkStrongNumber(n));
	}
}
