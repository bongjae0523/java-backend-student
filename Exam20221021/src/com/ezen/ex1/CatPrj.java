package com.ezen.ex1;

/*
 * 야홍이,뽀양,강산,로이
 */
public class CatPrj {

	public static void main(String[] args) {

		Cat 야홍 = new Cat("야홍");
		System.out.println(야홍);
		야홍.Character("미친");

		Cat 뽀양 = new Cat("뽀양",4,false,2.8);
		System.out.println(뽀양);
		뽀양.Character("평화");
		
		Cat 강산 = new Cat("강산",1,false,3.5);
		System.out.println(강산);
		강산.Character("무념");
		
		Cat 강산2 = 강산; // 강산2는 강산의 주소를 가져옴
		System.out.println(강산2);
		
		강산2.age = 2; // 강산2와 강산은 같은 주소를 사용하여 변수값을 바꾸면 같이 변경됨.
		System.out.println(강산);
		System.out.println(강산2);
		
		Cat 강산3 = new Cat(강산);
		System.out.println(강산3);
		
		강산3.age = 5;
		System.out.println(강산);
		System.out.println(강산3);
	}

}

class Cat{
	static String servant;
	String name ;
	int age;
	boolean sex;
	double weight;
	
	Cat(){}
	
	Cat(String name){
		this(name, 0 , false , 0.0);
	}
	Cat(String name, int age){
		this(name , age , false , 0.0);
	}
	Cat(String name, int age, boolean sex, double weight){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.servant = "김대철";
	}

	Cat(Cat copy){ // 인스턴스 복사를 위한 생성자
		this(copy.name, copy.age, copy.sex, copy.weight);
	}
	
	public String toString() {
		return name + "," + age + "살," + ( (sex) ? "여" : "남") + "," + weight + "kg" ;
	}
	
	void Character(String chararacter_) {
		System.out.println(chararacter_ + " 성질을 가지고 있다.");
	}
	
	void sleep(int sleep_) {
		System.out.println(name + "는" + sleep_ + "시간 잠을 잔다.");
	}
	
	
	void 예방접종일(String name, int day) {
		System.out.println(name + "의 접종일은 " + day + "일 입니다.");
	}
	
	
}