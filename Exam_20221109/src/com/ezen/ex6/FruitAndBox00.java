package com.ezen.ex6;
/*
 * 4. 지네릭스<T>에 제한을 과일로 하고 싶다면
 * 과일의 클래스를 작성하여 Apple와 Orange가 상속받으면 과일만 넣을수 있다.
 * 상속 또는 인터페이스로 가능.
 */
class Fruit{
	
}

class Apple extends Fruit{
	
	@Override
	public String toString() {
		return "i am an apple";
	}
}

class Orange extends Fruit{
	
	@Override
	public String toString() {
		return "i am an orange";
	}
}

class Box<T extends Fruit>{ //과일만 넣을수 있게...
	private T ap;
	void set(T a) {
		ap = a;
	}
	
	T get() {
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
		
		Box<Apple> abox = new Box();
		abox.set(new Apple());
		Apple a = abox.get();
		System.out.println(a);
		
		Box<Orange> obox = new Box();
		obox.set(new Orange());
		Orange o = obox.get();
		System.out.println(o);

//		Box<Person> Pbox = new Box();
//		Pbox.set(new Person());
//		Person p = (Person) Pbox.get();
//		System.out.println(p);
		
	}
	
}
