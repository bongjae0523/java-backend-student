package com.ezen.ex03;

class Outer2{
	private int num = 0;
	
	class Member{ //인스턴스 클래스(=멤버 클래스)
		void add(int n) {num += n;}
		int get() { return num;}
	}
}
public class intstanceClass {

	public static void main(String[] args) {
	
		Outer2 num1 = new Outer2();
		Outer2 num2 = new Outer2();

		Outer2.Member m1 = num1.new Member();
		Outer2.Member m2 = num2.new Member();
		
		m1.add(5);
		System.out.println(m1.get());
		
	}
}
