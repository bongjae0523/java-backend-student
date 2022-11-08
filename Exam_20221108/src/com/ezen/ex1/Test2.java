package com.ezen.ex1;
/*
 * 정수 한개 입력 받아서, 그 수가 3의 배수인지
 */
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("정수 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%3 == 0) {
			System.out.printf("입력: %d, %d은/는 3의 배수입니다.",num,num);
		}
		else
			System.out.printf("입력: %d, %d은/는 3의 배수가 아니다.",num,num);
	}

}
