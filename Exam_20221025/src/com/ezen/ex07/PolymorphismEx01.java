package com.ezen.ex07;



class Person{ //사람

}

class Student extends Person { //사람 중 학생

}

class WorkStudent extends Student{ //학생 중 근로학생

}


public class PolymorphismEx01 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Student s = new Student();
		WorkStudent ws = new WorkStudent();
		
		p = p; 
		p = s;
		p = ws;
		
		s = s;
		s = ws; 
//		s = p; //하위클래스가 상위클래스 참조불가
		
		ws = ws;
//		ws = p;
//		ws = s;
		
	}
	
}