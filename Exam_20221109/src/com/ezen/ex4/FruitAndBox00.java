package com.ezen.ex4;
/*
 * 3. Object 위치에 T로 표기하며 클래스에도 <T> 표기
 * 객체 생성할때 지네릭스를 표기하며 생성하면, 형변환 불필요.
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

class Box<T>{
	private T ap;
	void set(T a) {
		ap = a;
	}
	
	T get() {
		return ap;
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

	}
	
}
