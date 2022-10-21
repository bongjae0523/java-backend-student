package com.ezen.ex1;

public class Exam001 {

	public static String change(String str){
		return str +="456";
	}
	public static void main(String[] args) {
		String str = "abc123";
		System.out.println(str);
		str = change(str);
		System.out.println(str);
	}
}
