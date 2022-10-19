package ex1;

import java.util.*;

/*
 * 사칙연산 프로그램
 * 1:+, 2:-, 3:*, 4:/
 * 정수 2개 입력, 사칙연산 기호 입력 => 3개 입력
 * 10,20,4 		10/20=0.5
 * 10,20,1		10+20=30
 * 10/20/3		10*20=200
 */
public class FlowEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		System.out.print("값입력");
		int num1 = sc.nextInt();
		System.out.print("값입력");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 (1:+, 2:-, 3:*, 4:/)");
		int a = sc.nextInt();
		

		if(a==1) {
			System.out.println("결과는"+" "+(num1+num2));
		}
		else if(a==2) {
			System.out.println("결과는"+" "+(num1-num2));
		}
		else if(a==3) {
			System.out.println("결과는"+" "+(num1*num2));
		}
		else if(a==4) {
			System.out.println("결과는"+ " "+(num1/(double)num2));
		}
		else
			System.out.println("연산자가 틀립니다.");
		
		
		
		
	}

}
