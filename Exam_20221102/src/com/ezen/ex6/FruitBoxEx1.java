package com.ezen.ex6;
/*
 * ㅇㅖ제 12-1
 */
import java.util.ArrayList;

class Fruit					{ public String toString() {return "Fruit";}}
class Apple extends Fruit	{ public String toString() {return "Apple";}}
class Grape extends Fruit	{ public String toString() {return "Grape";}}
class Toy					{ public String toString() {return "Toy";}}

public class FruitBoxEx1 {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //Fruit의 자손 // void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); //Box<Apple>에는 apple만
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); //Box<Toy>에는 Toy만
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		System.out.println(grapeBox);
		
	}

}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)	{list.add(item);	}
	T get(int i)		{return list.get(i);}
	int size()			{return list.size();}
	public String toString() { return list.toString();}
}