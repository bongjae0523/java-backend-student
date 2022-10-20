package com.ezen.ex1;
/*
 * 
 */
public class ClassVarEx02 {

	public static void main(String[] args) {

		
		
	}

}

class Tests2{
	int iv = 0;
	static int cv =0;
	
	void ivfunc() {
		iv =0;
		cv = 0;
		testfunc();
	}
	
	static void cvfunc() {
		cv=100;
		testfunc();
	}
	
	static void testfunc() {
		cvfunc();
	}
	
	Tests2(){}
	
}
