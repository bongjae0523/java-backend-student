package com.ezen.ex2;
/*
 * 1.각각의 클래스를 작성하여 생성해주면 코드양이 늘어남
 * Apple, Orange만 있지만 클래스 수가 늘어나면 각 과일과 과일박스가 생성되야함.
 */
class Apple{
	
	@Override
	public String toString() {
		return "i am an apple";
	}
}

class Orange{
	
	@Override
	public String toString() {
		return "i am an orange";
	}
}

class AppleBox{
	private Apple ap;
	
	void set(Apple a) {
		ap = a;
	}
	
	Apple get() {
		return ap;
	}
}

class OrangeBox{
	private Orange or;
	void set(Orange o) {
		or = o;
	}
	
	Orange get() {
		return or;
	}
}

public class FruitAndBox00 {

	public static void main(String[] args) {

		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
//		Apple a = new Apple();
//		aBox.set(a); //주석처리된 문장을 아래와 같이 한줄로 표현.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
		Orange o = oBox.get();
	
		System.out.println(a);
		System.out.println(o);
		

	}
	
}
