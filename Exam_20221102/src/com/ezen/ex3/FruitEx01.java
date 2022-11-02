package com.ezen.ex3;

class Apple{
	public String toString() {
		return "i am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "i am an orange.";
	}
}

class Box{
	private Object ob;
	public void set(Object a) { ob = a;}
	public Object get() {return ob;}
}



public class FruitEx01 {

	public static void main(String[] args) {

		Box aBox = new Box();
		Box bBox = new Box();
		
		aBox.set("Apple");//new Apple()
		bBox.set("Orange");//new Orange()
		
		Apple a = (Apple) aBox.get();
		Orange b = (Orange) bBox.get();// ob를 b에게 전달
		
//		String a = (String) aBox.get();
//		String b = (String) bBox.get(); 
		// 위 입력 인자는 String을 참조하기때문에 형변환을 String로 해야함
		
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
