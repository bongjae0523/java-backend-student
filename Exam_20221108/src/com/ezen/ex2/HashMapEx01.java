package com.ezen.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {

		// 키, 값 ->Integer,String - 키는 Integer타입 값은 String타입
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Kim");
		map.put(5, "Park");
		map.put(7, "Lee");
		
		System.out.println(map.get(1)); // get(1) 1번 키 입력시 1번 값 출력
		System.out.println(map.get(5));
		System.out.println(map.get(7));
		
		map.remove(5); //삭제
		System.out.println(map.get(5)); // 삭제해서 null값 출력
		
		map.put(10, "Baik");
		map.put(9, "Hong");
		map.put(5, "Park");
		map.put(3, "PPark");
		
		Set<Integer> keySet = map.keySet(); // 반복문 돌리면서 출력하기 위해 사용....
		
		for(int n : keySet) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for(int n : keySet) {
			System.out.print(map.get(n) + "\t");
		}
		System.out.println();
		
		//반복자..... iterator
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t"); //key 출력
		}
		System.out.println();

		Iterator<Integer> it2 = keySet.iterator();
		while(it2.hasNext()) {
			System.out.print(map.get(it2.next())+"\t"); //value 출력
		}
		
		
		
		
		
	}

}
