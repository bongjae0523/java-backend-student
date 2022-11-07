package com.ezen.ex1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] num = {1,5,3,2,4}; 
		String[] str = {"aaa", "ab", "cccd", "bbbbb", "ac"};
		
		Arrays.sort(num); //오름차순 정렬
		Arrays.sort(str);
		
		for(int n : num) {
			System.out.print(n+"\t");
		}
		System.out.println();
		
		for(String s : str) {
			System.out.print(s +"\t");
		}

		System.out.println();

		Integer[] num2 = {1,5,3,2,4}; // Integer 클래스로 해야 동작.
		
		Arrays.sort(num2, new Desc()); //역순 정렬 // 조건을 직접 넣음.
		for(int n : num2) {
			System.out.print(n +"\t");
		}
	}

	
}

class Desc implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2)*-1;
	}
		
		
	
}
		
		
		