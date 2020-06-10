package com.capgemini;

public class ProblemA6 {

	public static void main(String[] args) {
		int[] ar = {1, 9, 7, 4, -1, 3, 2};
		getCout(ar);
		System.out.println("Lenghth of linked list is " + getCout(ar));
	}
	public static int getCout(int[] a) {
		int count = 1;
		for (int i : a) {
			System.out.printf(" i: %d count : %d ", i, count);
			if (i == -1)
				break;
			count++;
		}
		System.out.println(count);
		return count + 1;
	}
}
