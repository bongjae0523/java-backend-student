package com.ezen.ex06;



class Person{ //사람
	private String name;
	private int age;
	
	void eat() {
		System.out.println("먹는다.");
	}
}

class Student extends Person { //사람 중 학생
	void sutdy() {
		System.out.println("공부한다");
	}
}

class WorkStudent extends Student{ //학생 중 근로학생
	void work() {
		System.out.println("일한다");
	}
}

public class PolymorphismEx01 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
//		p = new Student();
//		p = new WorkStudent();
		
		
		Student s = new Student();
//		s = new WorkStudent();
//		s = new Person(); // 하위 클래스가 상위 클래스 참조불가

		s=(Student)p;
		
		WorkStudent ws = new WorkStudent();
//		ws = new Person(); // 하위 클래스가 상위 클래스 참조불가
//		ws = new Student(); // 하위 클래스가 상위 클래스 참조불가
		ws=(WorkStudent)s;
		
		ws.work();
		
	}
	
}