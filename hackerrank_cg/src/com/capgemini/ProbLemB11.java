package com.capgemini;

public class ProbLemB11 {

	public static void main(String[] args) {

		boolean re = checkPower(8);
		System.out.println("Numer is power of 5 " + re);
	}
	public static boolean checkPower(int n) {
		boolean result = false;
		int count = 1;
		if (n % 5 != 0)
			return result;
		else {
			while (n != 5) {
				n = n / 5;
				count++;
				if (n % 5 != 0)
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
