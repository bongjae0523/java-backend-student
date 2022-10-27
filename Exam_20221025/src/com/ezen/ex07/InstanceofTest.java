package com.ezen.ex07;

public class InstanceofTest {

	public static void main(String[] args) {

		FireEngine2 fe = new FireEngine2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine instanece.");
		}
		
		if(fe instanceof Car2) {
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object iinstance");
		}
		
		System.out.println(fe.getClass().getName());
	}

}

class Car2 {}
class FireEngine2 extends Car2 {}