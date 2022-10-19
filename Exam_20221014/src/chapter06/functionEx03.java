package chapter06;

import java.util.Scanner;

/*
 * 매개변수(입력)o 반환(출력)x
 * main에서 scanner 기능으로 입력 받아 매개변수로 보냄
 */
public class functionEx03 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램3");

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		
		func1(num); //함수 호출.(메서드 호출) // 인자 num을 통해 func1로 보냄
		
		System.out.println("프로그램 종료...");
	}
	
	static void func1(int number) { // 변수 이름이 main과 다를수도 있다.
	//    반환 없는 void 사용 // 매개변수 int number으로 지정
		System.out.println("매개변수 있고, 반환형 없는 함수테스트");

		System.out.println("func : " + number);
		
		System.out.println("main :"+number*2);
		
	}

}
