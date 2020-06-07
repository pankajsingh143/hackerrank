package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class ProblemA4 {

	public static void main(String[] args) {
		int[] ar = {0, 1, 3};
		getCount(ar);
	}
	public static void getCount(int[] a) {
		int sum = 0;
		String pair = "";
		Map<String, Integer> sumMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			System.out.println("sum " + sum);

			for (int j = 1; j < a.length; j++) {
				if (i == j)
					continue;
				sum = Math.abs(a[i] + a[j]);
				pair = i + "," + j;
				sumMap.put(pair, sum);

				System.out.printf("pair (%d, %d) and sum  %d %n %s", i, j, sum,
						pair);
			}
		}
		System.out.println(sumMap);
		for (String s : sumMap.keySet()) {
			/// if(sumMap.get(s))
		}
	}

}
