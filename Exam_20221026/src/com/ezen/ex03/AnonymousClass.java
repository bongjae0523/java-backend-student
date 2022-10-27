package com.ezen.ex03;

//익명클래스

interface Printable2{
	void print();
}

class Papers2{
	private String con;
	
	public Papers2(String s) {con = s;}
	
	public Printable2 getPrinter() {
		//익명클래스
		return new Printable2() {
			public void print() {
				System.out.println(con);
			}
		};
	}
}

public class AnonymousClass {

	public static void main(String[] args) {

		Papers2 p = new Papers2("로컬 클래스 예제 테스트 중입니다.");
		Printable2 prn = p.getPrinter();
		prn.print();
		
	}

}
