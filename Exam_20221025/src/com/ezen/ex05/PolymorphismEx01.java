package com.ezen.ex05;

public class PolymorphismEx01 {

	public static void main(String[] args) {

		Person p = new Person();
		p.work();
		p = new OfficeJob();
		p.work();
		p = new Person();
		p.work();
		p = new Student();
		p.work();
		p = new Worker();
		p.work();
		p = new SportsMan();
//		p.run(); // 에러...참조변수 Person에는 run 메서드가 없기 때문에 나오지 않는다.
//		Person p = new SportsMan();
//		p.run(); // 에러... 위와 같은 경우임. Person의 run 메서드가 없기 때문
		
	}

}


class Person{
	private String name;
	private int age;
	
	void work() {
		System.out.println("사람은 일한다.");
	}
}

class Student extends Person { //학생
	void work() {
		System.out.println("공부한다");
	}
}

class SportsMan extends Person{ //운동선수
	void work() {
		System.out.println("운동한다");
	}
	
	void run() {
		System.out.println("달린다");
	}
}

class OfficeJob extends Person{ //사무직
	void work() {
		System.out.println("사무실에서 일한다");
	}
}

class Worker extends Person{ //노동자
	void work() {
		System.out.println("현장에서 일한다.");
	}
}




