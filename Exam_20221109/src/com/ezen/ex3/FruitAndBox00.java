package com.ezen.ex3;
/*
 * 2. Box로 공통을 묶어서 클래스 작성
 * box는 object타입으로 모두를 받아들일수있음.
 * set() 메서드를 사용할때 클래스에 맞게 객세 생성 후
 * get() 메서드를 사용할때 형변환 필수로 하여 코드 작성.
 * 
 * Object이므로 다른 클래스도 접근이 가능하다. - 문제점.
 */
class Apple{
	
	@Override
	public String toString() {
		return "i am an apple";
	}
}

class Orange{
	
	@Override
	public String toString() {
		return "i am an orange";
	}
}

class Box{
	private Object ap;
	void set(Object a) {
		ap = a;
	}
	
	Object get() {
		return ap;
	}
}

class Person{
	
	@Override
	public String toString() {
		return "i am Person";
	}
}

public class FruitAndBox00 {

	public static void main(String[] args) {
		
		Box box = new Box();

		box.set(new Apple());
		Apple a = (Apple) box.get();
		System.out.println(a);
		
		box.set(new Orange());
		Orange o = (Orange) box.get();
		System.out.println(o);
		
		box.set(new Person());
		Person p = (Person) box.get();
		System.out.println(p);
		
		
	}
	
}
