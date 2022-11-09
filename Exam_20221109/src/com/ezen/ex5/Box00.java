package com.ezen.ex5;
/*
 * 지네릭스를 설정하여도 Object와 다를거 없이 어떠한것도 입력이 가능하다.
 * 아래와 같이 정수, 실수만 담으려면 상속을 사용하여 제한한다. --p673
 */

class Box<T extends Number>{ //정수, 실수 담는 박스로 정의...
	private T ap;
	void set(T a) {
		ap = a;
	}
	
	T get() {
		return ap;
	}
}


public class Box00 {

	public static void main(String[] args) {
		
		Box<Integer> i = new Box();
		i.set(10);
		
		Box<Double> d = new Box();
		d.set(10.5);
		
//		Box<String> st = new Box();
//		st.set("kor");
		
		
		
	}
	
}
