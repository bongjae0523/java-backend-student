package com.ezen.ex1;

class Cake{
	public void yaummy() {
		System.out.println("Cake");
	}
}

class CheeseCake extends Cake{
	@Override
	public void yaummy() {
		System.out.println("Cheese Cake");
	}
}

public class CakeTest {

	public static void main(String[] args) {

		Cake c1 = new CheeseCake();
		
		CheeseCake c2 = new CheeseCake();
		
		c1.yaummy();
		c2.yaummy();
		
		
	}

}
