package com.capgemini;

public class ProbLemB9 {

	public static void main(String[] args) {

		boolean re = checkPower(16);
		System.out.println("Numer is power of 2 " + re);
	}
	public static boolean checkPower(int n) {
		boolean result = false;
		int count = 1;
		if (n % 2 != 0)
			return result;
		else {
			while (n != 2) {
				n = n / 2;
				count++;
				if (n % 2 != 0)
					return result;
				else
					result = true;
			}
			System.out.println("count " + count);
		}
		System.out.println("result " + result);
		return result;
	}

}
