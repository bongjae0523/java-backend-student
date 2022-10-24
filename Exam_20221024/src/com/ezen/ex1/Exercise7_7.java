package com.ezen.ex1;

class Parent{
	int x =100;
	
	Parent(){
		this(200);
		System.out.println("Parent()" + x );
	}
	Parent(int x){
		this.x = x;
		System.out.println("Parent(int x)"+ x);
	}
	int getX() {
		return x;
	}
}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000);
		System.out.println("Child()"+ x);
	}
	Child(int x){
		this.x = x;
		System.out.println("Child(int x)"+ x);
	}
}

class Exercise7_7 {

	public static void main(String[] args) {

	Child c = new Child();
	
	System.out.println("x = "+ c.getX());
	
	}
}
