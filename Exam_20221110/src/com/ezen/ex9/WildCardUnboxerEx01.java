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
//				get 가능, set 불가능
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
//		box.set(new Toy()); 
//		에러. Toy 이거나 Toy를 상속한 대상만 가능. 
		System.out.println(t);
	}
//				set 가능, get 불가능
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
//		box.get(n);
//		에러. Toy 이거나 Object 가능. 
	}
}

public class WildCardUnboxerEx01 {

	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		Boxhander.inBox(box, new Toy());
		Boxhander.outBox(box);
		
	}
	
	public static void moveBox(Box < ? super Toy> a, Box< ? extends Toy> b){
//				Toy,Object				Toy,Toy 상속받은
//				set만 가능				get만 가능
//				b가 a로 이동 그냥 외워
	}
}
