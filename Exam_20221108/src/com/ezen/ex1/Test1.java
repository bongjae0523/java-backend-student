package com.ezen.ex1;
/*
 * 정수 한개를 입력 받아서, 그 수가 50이상의 수인지 50 미만의 수인지 확인
 */
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("정수 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >=50) {
			System.out.printf("입력: %d, %d은/는 50 이상입니다.",num,num);
		}
		else
			System.out.printf("입력: %d, %d은/는 50 미만입니다.",num,num);
	}

}
