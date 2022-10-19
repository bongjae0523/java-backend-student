package chapter06;

import java.util.Scanner;

/*
 * 매개변수(입력)o 반환(출력)o
 * 
 * main 함수에서 정수 2개 입력받아서
 * 받은 값을 함수에게 전달..
 * 함수는 그 값을 더해서
 * 메인 함수에게 다시 전달..
 * 
 * 메인함수는 입력받은 값과 전달 받은 값을 출력
 */
public class functionEx05 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램5");

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num1 = sc.nextInt();
		System.out.print("입력: ");
		float num2 = sc.nextFloat();
		
		System.out.println("입력받은 값:" + num1 + "," + num2);
		System.out.println("함수에서 전달 받은 값:"+func1(num1, num2)); //함수 호출.(메서드 호출) 
		
		System.out.println("프로그램 종료...");
	}
	
	static float func1(int num1, float num2) { 
		
		return num1+num2 ; 
	}

}
