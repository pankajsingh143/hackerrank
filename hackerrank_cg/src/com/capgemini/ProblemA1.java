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
		for (int i : indexList) {
			// List<Integer>
		}
		// System.out.println("f1 " + (A[7] - A[5]));
		/// System.out.println(("f2" + (A[6] - A[5])));

		int diff1 = Math.min((A[7] - A[5]), (A[6] - A[5]));
		// int diff2 = Math.min((), ())
		System.out.println(diff1);
		// 7,5,6
		// 9,5,6

		return 0;
	}
}
