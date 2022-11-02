package com.ezen.ex2;

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
		
		aBox.set(new Apple());
		bBox.set(new Orange());
		
		System.out.println(aBox.get()); // 타입을 생각하지 않고 출력한다.
		System.out.println(bBox.get()); // 개발자가 원하는 방향으로 가지 못하고 출력이 되어 뭐가 잘못되었는지 모른다.
		// 개발자가 원한 방향은 아래와 같은 형변환을 원함.
		
		Apple a = (Apple) aBox.get();
		Orange b = (Orange) bBox.get();// ob를 b에게 전달
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
