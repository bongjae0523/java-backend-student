package chapter06;

import java.util.Scanner;

/*
 * 매개변수(입력)o 반환(출력)o
 * 
 * main 함수에서 정수 하나 입력받아서
 * 받은 값을 함수에게 전달..
 * 함수는 그 값을 2배로 곱해서
 * 메인 함수에게 다시 전달..
 * 
 * 메인함수는 입력받은 값과 전달 받은 값을 출력
 */
public class functionEx04 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램4");

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		
		System.out.println("입력받은 값:" + num);
		System.out.println("함수에서 전달 받은 값:"+func1(num)); 
		
		System.out.println("프로그램 종료...");
	}
	
	static int func1(int number) { 
		
		int value = number*2 ;
		
		return value ;
		
//		return number*2 //바로 반환도 가능
	}

}
