package com.ezen.ex9;
/*
 * 와일드 카드 -p678
 * 상한 제한 목적....
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

class Toy{
	@Override
	public String toString() {
		return "Toy.....";
	}
}

class Boxhander{
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
//		box.set(new Toy()); 
//		에러. Toy 이거나 Toy를 상속한 대상만 가능. 위 Box의 set은 상위 클래스인 Objict이므로 안됨.
		System.out.println(t);
	}
	
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
	}
}


public class WildCardUnboxerEx01 {

	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		Boxhander.inBox(box, new Toy());
		Boxhander.outBox(box);
		
	}

}
