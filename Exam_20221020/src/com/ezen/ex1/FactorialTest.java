package com.ezen.ex1;

public class FactorialTest {

	public static void main(String[] args) {

		int result = factorial(10);
		
		System.out.println(result);
		
	}

	static int factorial(int n) {
		int result = 0 ;
		
		if(n == 1)
			return 1;
		result = n * factorial(n-1);
		
		return result;
	}
}
