package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class ProblemA3 {

	public static void main(String[] args) {
		int ar[] = {2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5};
		System.out.println(ar[ar.length - 1] + "  " + (ar.length - 1));
		getMaxcount(ar);
	}
	public static int getMaxcount(int[] a) {
		int count = 0;
		int index = 0;
		int result = -1;
		int mid = a.length / 2;
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
		System.out.print(index);

		System.out.print(countMap);
		for (Integer s : countMap.keySet()) {
			// if
		}
		System.out.println(result);
		return result;
	}
}
