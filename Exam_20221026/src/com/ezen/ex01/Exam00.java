package com.ezen.ex01;

class Person {
	String name;
	int age;
	static int leg = 2;

	void eat() {
		System.out.println("먹는다");
	}
}

class Student extends Person {
	String major;
	String no;

	void study() {
		System.out.println("공부한다");
	}
}

public class Exam00 {

	public static void main(String[] args) {

		Person.leg = 10;
		System.out.println(Person.leg); // 객체 생성전에는 클래스명 붙여서 가능.

		Person p1 = new Person();
		Student s1 = new Student();

	}

}