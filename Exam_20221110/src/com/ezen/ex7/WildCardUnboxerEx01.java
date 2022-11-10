package com.ezen.ex7;
/*
 * 와일드 카드 -p678
 * 8번 패키지와 같이 봐야함.
 * 상한제한....
 * Number 이거나 Number 상속한 대상만 가능...
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

class UnBoxer{ //상한 제한...

//	              <T> 생략가능
//	public static <T> void peekBox(Box<? extends Number> box) {
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
	
}

public class WildCardUnboxerEx01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<>();
		ibox.set(20);
		UnBoxer.peekBox(ibox);

		Box<Double> dbox = new Box<>();
		dbox.set(12.5);
		UnBoxer.peekBox(dbox);

//		에러. Number가 하위클래스이므로 Object 불가능.
//		Box<Object> obox = new Box<>();
//		obox.set("Sweet");
//		UnBoxer.peekBox(obox); 

		
		
	}

}
