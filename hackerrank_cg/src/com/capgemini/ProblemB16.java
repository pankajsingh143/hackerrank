package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class ProblemB16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> resultList = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			if (getArmstrongNumber(i))
				resultList.add(i);
		}
		System.out.println("Armstron list" + resultList);
		// collectDigits(56);
	}
	public static boolean getArmstrongNumber(int n) {
		List<Integer> dig = collectDigits(n);
		boolean result = false;
		int sum = 0;
		for (Integer i : dig) {
			sum = sum + (int) Math.pow(i, 3);
		}
		System.out.println("sum " + sum);
		if (sum == n)
			result = true;
		return result;
	}

	public static List<Integer> collectDigits(int n) {
		int result = 0;
		List<Integer> digits = new ArrayList<Integer>();
		System.out.println("No of digits " + String.valueOf(n).length());
		for (int i = 0; i <= String.valueOf(n).length() - 1; i++) {
			digits.add(n % 10);
			n = n / 10;
			System.out.println(" n: " + n);
			if (n < 10 && n != 0)
				digits.add(n);
			System.out.print(" n = " + n);
		}
		System.out.println(digits);
		return digits;

	}
}
