package com.capgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemB30 {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 4}, {0, 2, 7}, {4, 12}, {1, 2, 5, 6}};
		getCount(a);
	}
	public static void getCount(int[][] a) {
		int minLength = a[0].length;
		Map<Integer, String> map = new HashMap<>();
		for (int[] ar : a) {
			if (minLength > ar.length) {
				minLength = ar.length;
				// System.out.printf("Minlength: %d ", minLength);
				// System.out.print("ar " + ar);
			}
			map.put(ar.length, Arrays.toString(ar));
		}
		System.out.println(map);
		System.out.println(" Shotest array is " + map.get(minLength)
				+ " and length =" + minLength);

	}

}
