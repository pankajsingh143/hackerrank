package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class ProblemA3 {

	public static void main(String[] args) {
		int ar[] = {2, 2, 3, 3, 3, 4, 4};
		System.out.println(ar[ar.length - 1] + "  " + (ar.length - 1));
		getMaxcount(ar);
	}
	public static int getMaxcount(int[] a) {
		int count = 0;
		int index = 0;
		int result = -1;
		int mid = a.length / 2;
		System.out.println("mid " + mid);
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {
				index = i;
				countMap.put(a[index], count + 1);

				count = 0;
			}
		}
		// System.out.print(index);

		System.out.print(countMap);
		int max = 0;
		for (Integer s : countMap.keySet()) {
			// max = countMap.get(s);
			System.out.println("max inside for " + max);
			if (countMap.get(s) > max) {
				System.out.println("countMap.get(s) " + countMap.get(s));
				System.out.println("countMap s " + s);

				max = countMap.get(s);
				index = s;
			}

		}
		System.out.println("max " + max);

		if (max > mid) {
			result = index;
		}
		System.out.println(result);
		return result;
	}
}
