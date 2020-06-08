package com.capgemini;

public class ProblemB10 {

	public static void main(String[] args) {

		boolean re = checkPower(100);
		System.out.println("Numer is power of 10 " + re);
	}
	public static boolean checkPower(int n) {
		boolean result = false;
		int count = 1;
		if (n % 10 != 0)
			return result;
		else {
			while (n != 10) {
				n = n / 10;
				count++;
				if (n % 10 != 0)
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
