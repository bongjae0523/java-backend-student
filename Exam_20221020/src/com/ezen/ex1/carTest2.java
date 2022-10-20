package com.ezen.ex1;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){ // 디폴트생성자 기본값 설정.
		this("white","auto",4);
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType = gearType;
		this.door = door;
	}
}


public class carTest2 {

	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2=new Car("blue");
		
		System.out.println("c1의 color="+c1.color+",gearType"+c1.gearType+",door="+c1.door);
		System.out.println("c2의 color="+c2.color+",gearType"+c2.gearType+",door="+c2.door);
		
	}

}
