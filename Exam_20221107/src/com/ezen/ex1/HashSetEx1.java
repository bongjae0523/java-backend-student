package com.ezen.ex1;
/*
 * p632 예제 11-20
 */
import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {

	Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
	
	Set set = new HashSet();
	
	for(int i = 0; i < objArr.length; i++) {
		set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
	}
	// HashSet에 저장된 요소들을 출력한다.
	System.out.println(set);
	
	}

}

//[1,1,2,3,4]
//1이 두번 출력 된 이유는 첫번째 1은 String인스턴스, 두번째 1은 Interger인스턴스로
// 서로 다른 객체이므로 중복으로 간주하지 않는다.