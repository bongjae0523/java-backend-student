package com.ezen.ex1;
/*
 * 사람 클래스 참조변수는 사람 클래스 안에 있는 자원 및상속 받은 Object 클래스만 접근가능
 * 사람 클래스를 상속받은 학생, 근로학생 클래스 안 자원은 접근 불가
 * 다만, 사람 클래스 안에 있는 메소드를 하위클래스에서 재정의(오버라이딩)하면 그 메소드 자원 접근가능
 */
public class OverridingEx00 {

	public static void main(String[] args) {

		사람 임채리 = new 근로학생();
		임채리.sleep();
		
		사람 윤민호 = new 학생();
		윤민호.sleep();
	}

}

class 사람{
	String name;
	int age;
	
	void sleep() {
		System.out.println("사람은 잠잔다.");
	}
}

class 학생 extends 사람{
	String major;
	
	void study() {
		System.out.println("학생은 공부하다.");
	}

	void sleep() {
		System.out.println("학생은 잠잔다.");
	}

}

class 근로학생 extends 학생{
	String job ;
	
	void work() {
		System.out.println("근로학생은 일을 한다.");
	}
	
	@Override //annotation -> 에러체크 방지
	void sleep() {
		System.out.println("근로학생은 잠잔다.");
	}
	
}