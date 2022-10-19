package chapter06;

import java.util.Scanner;

/*
 * 매개변수(입력)x 반환(출력)o
 */
public class functionEx02 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램2");
		int n = func1(); //함수 호출.(메서드 호출) // int n = 아래 입력 수
		
		System.out.println("main :"+n*2);
		
		System.out.println("프로그램 종료...");
	}
	
	static int func1() {
	//    int(자리) 반환하는 return의 변수와 동일하게 //반환하지 않는 void 쓰일수 없음
	//	  문자열은 string으로 한다. 당연하거죠? 모르면 앞에 다시 보고 오세요.
		System.out.println("매개변수 없고, 반환형 있는 함수테스트");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		System.out.println("func : " + num);
		
		return num ;
		
	}

}
