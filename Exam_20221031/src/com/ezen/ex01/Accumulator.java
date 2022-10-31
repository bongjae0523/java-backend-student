package com.ezen.ex01;

//출력결과
// sum=45

public class Accumulator {

	static int sum =0;
	
	static void add(int num) {
		sum += num;
		
	}
	
	static void showResult() {
		
		System.out.println("출력 결과 = " + sum);
	}


	
	
	public static void main(String[] args) {
		
		
		for(int i=0; i<10; i++) 
			Accumulator.add(i);
		
		Accumulator.showResult();
	}
}


