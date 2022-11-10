package com.ezen.ex3;
/*
 * 제네릭 메서드 -p684
 *  메서드 생성시 반환타입 앞에도 <T> 제너릭 써야함.
 */
class Box<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
}

class BoxFactory{
	//            <T> 반환타입  함수명(매개변수)
	public static <T> Box<T> makeBox(T o){ //제네릭 메서드
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}



public class GenericMethodEx01 {

	public static void main(String[] args) {

		Box<String> sBox = BoxFactory.makeBox("Sweet");
//		sBox = BoxFactory.makeBox(12345); // String 타입만 가능
		System.out.println(sBox.get());

		Box<Double> dBox = BoxFactory.makeBox(7.85);
		System.out.println(dBox.get());
		
	}

}
