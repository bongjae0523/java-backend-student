package com.ezen.ex08;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money =1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하오니 물건구매를 못한다.");
			return; // return 없으면 if문 만 false로 아래 적용됨.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매");
//		System.out.println(p.toSTring + "을/를 구매"); // 문자열과 만나면 .toString 생략
		
	}
}


public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
		
	}

}
