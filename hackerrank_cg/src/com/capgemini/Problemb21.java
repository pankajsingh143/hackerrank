package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class Problemb21 {

	public static void main(String[] args) {
		String[][] a = {{"Abc", "80"}, {"Xyz", "60"}, {"Xyz", "65"},
				{"Abc", "86"}};
		getCount(a);
	}
	public static void getCount(String[][] D) {
		Map<String, Integer> avgMap = new HashMap<String, Integer>();
		int average = 0;
		int count = 1;
		int sumOfMarks = 0;
		for (int i = 0; i < D.length; i++) {
			for (int j = 1; j < D.length; j++) {
				if (D[i][0].equalsIgnoreCase(D[j][0]) && i != j) {
					// System.out.printf("i : %d j: %d%n", i, j);
					// System.out.println(D[i][0]);
					count++;
					sumOfMarks = Integer.valueOf(D[i][1])
							+ Integer.valueOf(D[j][1]);
					average = sumOfMarks / count;
					// System.out.printf("sumofMarks: %d count: %d average: %d
					// ",
					// sumOfMarks, count, average);

					avgMap.put(D[i][0], average);
					count = 1;

				} else {
					if (!avgMap.containsKey(D[i][0])) {
						avgMap.put(D[i][0], Integer.valueOf(D[i][1]));
					}
				}
			}
		}
		// System.out.println("pow " + Math.pow(2, 2));
		System.out.println(avgMap);
		int max = 1;
		String subject = "";
		for (String s : avgMap.keySet()) {
			// max = avgMap.get(s);
			if (avgMap.get(s) > max) {
				max = avgMap.get(s);
				subject = s;
			}
		}
		System.out.printf("%s %d", subject, max);
	}
}
