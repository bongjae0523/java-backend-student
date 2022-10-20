package com.ezen.ex2;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){ // 디폴트생성자 기본값 설정.
		this("white","auto",4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){ //인스턴스 생성자를 위한 생성자
		this(c.color, c.gearType, c.door); 
	}
}


public class carTest3 {

	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2=c1;
		Car c3=new Car(c1); // c1 의 복사본 c3 생성
		
		System.out.println("c1의 color="+c1.color+",gearType="+c1.gearType+",door="+c1.door);
		System.out.println("c2의 color="+c2.color+",gearType="+c2.gearType+",door="+c2.door);
		System.out.println("c3의 color="+c3.color+",gearType="+c3.gearType+",door="+c3.door);
		System.out.println("---------------------------------------");
		c1.color="blue";
		c2.door=3;
		c3.door=2;
		System.out.println("c1의 color="+c1.color+",gearType="+c1.gearType+",door="+c1.door);
		System.out.println("c2의 color="+c2.color+",gearType="+c2.gearType+",door="+c2.door);
		System.out.println("c3의 color="+c3.color+",gearType="+c3.gearType+",door="+c3.door);
		
	}

}
