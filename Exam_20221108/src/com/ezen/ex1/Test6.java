package com.ezen.ex1;
/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램
 */

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		System.out.println("알파벳 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println(input);
		
		int a = (int)(Math.random()*input.length());
		System.out.println(a);
		
		char ch = input.charAt(a);
		
		if(ch>='a' && ch <'z') {
			System.out.println("소문자");
		}
		else if (ch>='A' && ch <'Z') {
			System.out.println("대문자");
		}
		else {
			System.out.println("영어 아님");
		}
	}

}
