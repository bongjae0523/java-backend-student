package com.ezen.ex01;

public class EqualsEx02 {

	public static void main(String[] args) {

		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같아");
		else
			System.out.println("p1과 p2는 달라");

		if(p1.equals(p2))
			System.out.println("p1과 p2는 같아");
		else
			System.out.println("p1과 p2는 달라");
		
		System.out.println(p1.toString());
	}
}

class Person{
	long id;
	
	Person(long id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	@Override
	public String toString() {
		return id + "";
	}
	
}