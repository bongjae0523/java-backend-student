package com.ezen.ex8;
/*
 * 와일드 카드 -p678
 * 7번 패키지와 같이 봐야함
 * 하한 제한...Integer이거나 Integer 상위 클래스만 가능..
 * Integer ->Number ->Object  전체 가능하다.
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

class UnBoxer{ // 하한 제한...

	public static void peekBox(Box<? super Integer> box) {
		System.out.println(box);
	}
	
}

public class WildCardUnboxerEx01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<>();
		ibox.set(20);
		UnBoxer.peekBox(ibox);

//		에러.  Double 타입은 Number를 상속받은 Interger와 동일한 하위클래스
//		Box<Double> dbox = new Box<>();
//		dbox.set(12.5);
//		UnBoxer.peekBox(dbox);
		
//		Double이 아닌 Number을 사용하면 가능.
		Box<Number> dbox = new Box<>();
		dbox.set(12.5);
		UnBoxer.peekBox(dbox);

		Box<Object> oBox = new Box();
		oBox.set("Sweet");
		UnBoxer.peekBox(oBox);
		
		
		
	}

}
