package com.ezen.ex1;
/*
 * 정수 입력받아서 양수인지 음수인지 확인
 */
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		System.out.println("정수 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >0) {
			System.out.printf("입력: %d, %d은/는 양수입니다.",num,num);
		}
		else if(num == 0) {
			System.out.printf("입력: %d, 다시 입력하시오",num);
		}
		else {
			System.out.printf("입력: %d, %d은/는 음수입니다.",num,num);
		}
	}	
}
