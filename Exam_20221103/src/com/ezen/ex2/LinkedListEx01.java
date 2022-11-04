package com.ezen.ex2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> lists = new LinkedList<>();
		
		lists.add("Toy");
		lists.add("Box");
		lists.add("Robot");
		
		for(String str : lists)
			System.out.print(str + '\t');
		System.out.println();
		
		lists.remove(1);
		
		for(int i = 0; i<lists.size(); i++) 
			System.out.print(lists.get(i) + '\t');
		System.out.println();
	
		System.out.println(lists.peekFirst());	
	
	}

}
/*
* Toy	Box	Robot	
* Box	Robot	
*/
