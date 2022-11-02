package com.ezen.ex6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(20); //래퍼클래스 확인 //기본형타입은 객체를 가지지않는다.
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1부터 4 전까지 저장된 객체를 반환
		print(list1, list2);
		
		Collections.sort(list1); //list1과 list2를 정렬한다.
		Collections.sort(list2); // Collections.sort(List l)
		print(list1, list2);
		
		//list1이 list2를 포함하고 있는지
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

		list2.add("B"); //2,4,20,B
		list2.add("C"); //2,4,20,B,C
		list2.add(3, "A"); // 3번째 위치에 A를 넣어라 //2,4,20,A,B,C
		print(list1, list2);

		list2.set(3, "AA"); // 3번째를 바꿔라 //2,4,20,AA,B,C
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
