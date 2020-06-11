package com.capgemini;

import java.util.StringJoiner;

public class ProblemB3 {
	public static void main(String... s) {
		String str = "good  good bye day good day";
		String[] sar = str.split(" ");
		// System.out.println(Arrays.toString(sar));
		StringJoiner strj = new StringJoiner(" ");
		for (String item : sar) {
			int index = 0;
			if (str.indexOf(item) != str.lastIndexOf(item)) {
				// System.out.println("duplicate " + item);
				if (strj.toString().indexOf(item) < 0)
					strj.add(item);
				item = "";
			}
			strj.add(item);
			index++;
		}

		System.out.println(strj.toString());
	}
}
