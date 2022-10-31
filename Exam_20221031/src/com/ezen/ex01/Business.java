package com.ezen.ex01;

class Man{
	String name;
	
	public Man() {}
	
	public Man(String name) {
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String company, String position) {
		this.company = company;
		this.position = position;
	}

	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}

public class Business {
	public static void main(String[] args) {

		BusinessMan bm = new BusinessMan("ezen", "0308");
		bm.name = "봉봉";
		
		bm.tellYourName();
		bm.tellYourInfo();
		System.out.println("----------------------");
		
		BusinessMan bm2 = new BusinessMan("재재","zeze", "4814");
		bm2.tellYourName();
		bm2.tellYourInfo();
	}
}


