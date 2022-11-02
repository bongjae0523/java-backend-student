package com.ezen.ex4;

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

class Box{
	private Object ob;
	public void set(Object a) { ob = a;}
	public Object get() {return ob;}
}

public class FruitEx01 {

	public static void main(String[] args) {

		Box aBox = new Box();
		Box bBox = new Box();
		
		Apple a = (Apple) aBox.get();
		
		aBox.set("Apple");//new Apple()
		bBox.set("Orange");//new Orange()
		
		System.out.println(aBox.get());
		System.out.println(bBox.get());
		
		
	}
}
