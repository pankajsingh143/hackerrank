package com.capgemini;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProblemA4 {

	public static void main(String[] args) {
		int[] ar = {0, 1, 3};
		getCount(ar);
	}
	public static void getCount(int[] a) {
		int sum = 0;
		String pair = "";
		Map<Integer, String> sumMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			// System.out.println("sum " + sum);

			for (int j = 1; j < a.length; j++) {

				sum = Math.abs(a[i] + a[j]);
				pair = i + "," + j;
				sumMap.put(sum, pair);

				// System.out.printf("pair (%d, %d) and sum %d %n %s", i, j,
				// sum,
				// pair);
			}
		}
		System.out.println(sumMap);
		int min = 1;

		Set<Integer> minSet = new HashSet<>();
		for (Integer n : sumMap.keySet()) {
			// min = sumMap.get(s);
			// System.out.println("min " + min);
			if (min > n) {
				min = n;
				System.out.printf("min %d s %d", min, n);
			}
			minSet.add(min);
			if (min == n)
				minSet.add(n);
		}
		System.out.println(minSet);
		for (int n : minSet) {
			System.out.printf("min %d pair %s ", n, sumMap.get(n));
		}

	}

}
