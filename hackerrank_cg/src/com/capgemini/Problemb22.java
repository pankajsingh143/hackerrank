package com.capgemini;

public class Problemb22 {

	public static void main(String[] args) {
		int[] A = {5, 4, 2, 3, 9};
		int sum = 14;
		getCount(A, sum);
	}
	public static void getCount(int[] A, int sum) {
		int sumAr = 0;
		int count = 1;
		for (int i = 0; i < A.length; i++) {
			sumAr = sumAr + A[i];
			if (sumAr == sum) {
				count = i;
				break;
			} else {
				count = -2;
			}
		}
		System.out.println(count + 1);
	}

}
