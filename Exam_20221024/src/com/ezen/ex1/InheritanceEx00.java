package com.ezen.ex1;

public class InheritanceEx00 {

	public static void main(String[] args) {

	Person p = new Person();
	
	Student s = new Student();
	System.out.println(s.name);
	System.out.println(s.age);

	System.out.println("--------------------------------");
	Student s1 = new Student("학생","1111");
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.major);
	System.out.println(s1.no);

	System.out.println("--------------------------------");
	Student s2 = new Student("동",25,"학생","2222");
	System.out.println(s2.name);
	System.out.println(s2.age);
	System.out.println(s2.major);
	System.out.println(s2.no);

	
	System.out.println("--------------------------------");
	SportsMan sp = new SportsMan("송흥민",30,"츅국");	
	System.out.println(sp.name);
	System.out.println(sp.age);
	System.out.println(sp.sports);

	System.out.println("--------------------------------");
	SportsMan sp2 = new SportsMan("김하성",27,"야구선수");	
	System.out.println(sp2.name);
	System.out.println(sp2.sports);
	sp2.운동();
	
	System.out.println("--------------------------------");
	SportsMan sp3 = new SportsMan();	
	System.out.println(sp3.name);
	
	System.out.println("--------------------------------");
	WorkStudent ws = new WorkStudent("해", 32, "학생", "33333", "조교");
	System.out.println(ws.name);
	System.out.println(ws.age);
	System.out.println(ws.major);
	System.out.println(ws.no);
	System.out.println(ws.job);
	
//	Person 사람 = new Student();
//	Student 학생 = new Person();
	
	
	}

}

//사람
class Person{
	String name ;
	int age;
	
	public Person(){
		this(null,0);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;                                                                                                                                                                                                                                                                                                                           
	}

	void sleep() {
		System.out.println("잠을 잔다...");
	}

	void eat() {
		System.out.println("먹는다.");
	}
}
//사람중에 학생
class Student extends Person {
	String major;//전공
	String no; // 학번

	Student(){
		this(null,0,null,null);
	}
	
	Student(String major, String no){
		this(null,0,major,no);
	}

	Student(String name, int age, String major,String no){
//		this.name = name; //super 쓰지 않고 this를 써서도 가능하다. 
//		this.age = age;
		super(name, age); //조상 클래스의 2개 매개변수가 있는 생성자를 참조한다
		this.major = major;
		this.no = no;
	}

	
	void study() {
		System.out.println("공부한다.");
	}

}
//학생 중에 일하는 근로학생
class WorkStudent extends Student{
	String job; //학내에서 일하는 종류
	
	public WorkStudent() {
		this(null,0,null,null,null);
	}
	
	public WorkStudent(String name, int age, String major, String no, String job) {
		super(name, age,major,no); 
		this.job = job;
	}

	void work() {
		System.out.println("일한다.");
	}
	
}

class SportsMan extends Person{
	String sports; // 운동종목

	SportsMan(){
		this(null,0,null);
	}

	SportsMan(String name, int age, String sports){
		super(name, age); //조상 클래스의 2개 매개변수가 있는 생성자를 참조한다
		this.sports = sports;
	}
	void 운동() {
		System.out.println("운동한다.");
	}
}