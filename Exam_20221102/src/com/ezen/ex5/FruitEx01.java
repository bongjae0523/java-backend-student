package com.ezen.ex5;


class Apple{
	public String toString() {
		return "i am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "i am an orange.";
	}
}

class Box<T>{
	private T ob;
	public void set(T a) { ob = a;}
	public T get() {return ob;}
}

public class FruitEx01 {

	public static void main(String[] args) {

		Box<Apple> aBox = new Box();
		Box<Orange> bBox = new Box();
		
		aBox.set(new Apple());
		bBox.set(new Orange());	
		
		Apple a = aBox.get();
		Orange b = bBox.get();
		
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
