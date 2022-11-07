package com.ezen.ex1;
/*
 * p632 예제 11-21
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+"\t");
			set.add(new Integer(num));
		}
		System.out.println();
		System.out.println(set);
		
		System.out.println("--정렬 후--");
		
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); 		// Collections.sort(List list)
		System.out.println(list);
	}

}
// LinkedList로 타입변환은 Set에는 정렬 기능이 없기때문 //Set은 순서X
