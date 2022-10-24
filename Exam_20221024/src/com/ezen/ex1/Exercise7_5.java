package com.ezen.ex1;

class Product{
	int price;
	int bonusPoint;
	
	public Product() {}
	
	Product(int price){ 
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){} //상위클래스의 디폴트생성자 없음.
	
	public String toString() {
		return "Tv";
	}
}

class Exercise7_5 {

	public static void main(String[] args) {

		Tv t = new Tv();
		
	}
}
