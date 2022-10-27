package com.ezen.ex03;

interface Printable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String s) {con = s;}
	
	public Printable getPrinter() {
		
		class Printer implements Printable{ // printer 클래스 정의
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer(); // Printer 클래스 생성
	}
}



public class LocalClass {

	public static void main(String[] args) {

		Papers p = new Papers("로컬 클래스 예제 테스트 중입니다.");
		Printable prn = p.getPrinter();
		prn.print();
		
		
	}
}
