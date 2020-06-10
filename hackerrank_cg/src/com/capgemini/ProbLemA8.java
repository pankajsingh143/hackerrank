package com.capgemini;

import java.util.Arrays;

public class ProbLemA8 {

	public static void main(String[] args) {
		int A[] = {1, 3, 4, 7};
		System.out.println("Array is sorted " + getCountofSwaps(A));
	}
	public static boolean getCountofSwaps(int[] A) {
		int countofSwaps = 0;
		boolean result = false;
		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1]) {
				countofSwaps++;
				System.out.println("A[i] = " + A[i]);
			}
		}
		System.out.println(countofSwaps);
		System.out.println(Arrays.toString(A));
		if (countofSwaps == 1 || countofSwaps == 0)
			result = true;
		return result;
	}

}
