package com.ezen.ex5;
/*
 * 제네릭 메서드 
 * 
 */
class Box<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
}

class BoxFactory{
	public static <T> T makeBox(Box<T> o){ //제네릭 메서드
		return o.get();
	}
}



public class GenericMethodEx01 {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.set("Sweet");
		//                      <String> 생략가능
//		String str = BoxFactory.<String>makeBox(box);
		String str = BoxFactory.makeBox(box);
		System.out.println(str);
		
		
		
	}

}
