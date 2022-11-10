package com.ezen.ex6;
/*
 * 와일드 카드 -p678
 * 제한없이 모든 타입 가능하게 <?> 사용가능.
 * 
 */
class Box<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
	@Override
	public String toString() {
		return ob.toString();
	}
}

class UnBoxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

//								  (Box<T> 대신 <?>로 사용가능 
	public static <T> void peekBox(Box<?> box) {
		System.out.println(box);
	}
	
}

public class WildCardUnboxerEx01 {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.set("Sweet");
		UnBoxer.peekBox(box);
		
		Box<Integer> ibox = new Box<>();
		ibox.set(20);
		UnBoxer.peekBox(ibox);
		
		
	}

}
