package com.ezen.ex2;
/*
 * Treemap은 정렬이 되어있음.
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx03 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("kor", "국어");
		map.put("eng", "영어");
		map.put("math", "수학");
		map.put("com", "전산1");
		map.put("com", "전산2");
		map.put("com", "전산3");
		map.put("com", "전산");
		map.put("sci", "과학");
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+"\t"); 
		}
		System.out.println();
		
		Iterator<String> it2 = keySet.iterator();
		while(it2.hasNext()) {
			System.out.print(map.get(it2.next())+"\t"); 
		}
	
	}

}
