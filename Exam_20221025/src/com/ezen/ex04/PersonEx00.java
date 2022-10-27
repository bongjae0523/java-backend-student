package com.ezen.ex04;

public class PersonEx00 {

	public static void main(String[] args) {

		Student 백수민 = new Student("java");
		백수민.name = "백수민";
		
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name){
		this.name = name;
	}
	
	void eat() {
		System.out.println("사람은 먹는다");
	}
}

class Student extends Person{
	String major;
	String no;
	
	Student(){
		super("백수민");
	}
	
	Student(String major){
		super("백수민"); // 상위 클래스에 디폴트 생성자가 없기때문에 String 입력
		this.major = major;
	}
	
	void study() {
		System.out.println("학생은 공부한다");
	}
}