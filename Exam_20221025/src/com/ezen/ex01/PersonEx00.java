package com.ezen.ex01;

public class PersonEx00 {

	public static void main(String[] args) {

		Person 김대철 = new Person();
		김대철.name = "김대철" ;
		
		Student 백수민 = new Student();
		백수민.name = "백수민";
		
		
	}
}

class Person{
	String name;
	int age;
	
	void eat() {
		System.out.println("사람은 먹는다");
	}
}

class Student extends Person{
	String major;
	String no;
	
	void study() {
		System.out.println("학생은 공부한다");
	}
}