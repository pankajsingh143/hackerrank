package com.capgemini;

import java.util.Arrays;

public class ProblemA2 {

	public static void main(String[] args) {
		int[] A = {0, 1, 2, 2, 3, 5};

		int[] B = {500000, 500000, 0, 0, 0, 20000};
		System.out.println("No of pairs " + getPairs(A, B));

		// System.out.println(A[3] + (B[3] / 1000000));

	}
	public static int getPairs(int[] A, int[] B) {
		int result = 0;
		double[] C = new double[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] + (double) B[i] / 1000000;
		}
		// c[] = [1.5, 6.02, 78.0, 8.0, 89.01, 67.009]
		for (int i = 0; i < C.length; i++) {
			for (int j = 1; j < C.length; j++) {
				if (C[i] * C[j] >= C[i] + C[j]) {
					System.out.printf("is a pair { %d ,%d} ", i, j);
					count++;

				}
			}
		}
		System.out.println(Arrays.toString(C));
		if (count > 1000000000)
			count = 1000000000;

		return count;
	}

}
