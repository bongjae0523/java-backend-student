package com.ezen.ex2;
/*
 * HashMap는 정렬이 안됨.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		
		map.put("kor", "국어");
		map.put("eng", "영어");
		map.put("math", "수학");
		map.put("com", "전산");
		
		System.out.println(map.get("kor")); 
		System.out.println(map.get("eng"));
		System.out.println(map.get("math"));
		System.out.println(map.get("com"));
		
		Set<String> keySet = map.keySet();
		
//		for(String str : keySet) {
//			System.out.print(str + "\t");
//		}
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+"\t"); // 순서 정렬이 안되어있다.
		}
		System.out.println();
		
		Iterator<String> it2 = keySet.iterator();
		while(it2.hasNext()) {
			System.out.print(map.get(it2.next())+"\t"); 
		}
	
	}

}
