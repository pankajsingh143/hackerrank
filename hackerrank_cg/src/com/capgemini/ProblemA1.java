package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class ProblemA1 {

	public static void main(String[] args) {
		int[] Ar = {0, 8, 9, 7, 5, 6, 9, 5, 6, 7};
		getArray(Ar);

	}
	public static int getArray(int[] A) {
		// min {A[2] − A[3], A[4] − A[3]}{2,3,4}
		List<Integer> indexList = new ArrayList<>();
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1] && A[i + 2] > A[i + 1]) {
				// System.out.print(i + " ");
				indexList.add(i);
			}

		}
		System.out.println(indexList);
		List<Integer> diffList = new ArrayList<Integer>();
		int diff = 0;
		// 7,5,6
		// 9,5,6
		for (int i : indexList) {
			diff = Math.min((A[i] - A[i + 1]), (A[i + 2] - A[i + 1]));
			diffList.add(diff);
			diff = 0;
		}
		int min = 0;
		for (int i : diffList) {
			min = i;
			if (i < min)
				min = i;
		}
		System.out.println(diffList);
		int result = -1;
		if (!indexList.isEmpty()) {
			result = min;
		}
		System.out.println("Result is " + result);
		return result;
	}
}
