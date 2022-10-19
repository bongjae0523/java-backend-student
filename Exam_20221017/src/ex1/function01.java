package ex1;

import java.util.Scanner;

/*
 * 함수 4가지 유형
 * 1.반환x매개변수x
 * 2.반환o매개변수o
 * 3.반환x매개변수o
 * 4.반환o매개변수x
 * 
 * 두개 정수 입력을 받아서 나누기 기능을 하는 프로그램 작성
 */
public class function01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작...");
		
		func1();
		
		System.out.println("프로그램 종료...");
	}
	// 1. 반환x 매개변수x
	static void func1(){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("나눗셈을 진행합니다");
		System.out.println("첫번째 정수를 입력하시오");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 정수를 입력하시오");
		int num2 = sc.nextInt();
		
		int value = num1/num2 ;
		
		System.out.println("value = "+value);
	}
}


