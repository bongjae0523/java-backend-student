package com.ezen.ex04;

public class SingletonEx01 {

	public static void main(String[] args) {
		SingletonTest s = new SingletonTest();
		s.sleep();
		
		
	}

}


class SingletonTest{
	final int age =10;
	
	SingletonTest() { //생성자 앞에 private 붙으면 객체 생성 못함.
	}
	
	void sleep() {
		
	}
}