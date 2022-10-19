package ex1;

import java.util.*;

/*
 * switch 
 */
public class FlowEx04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("점수를 입력하세요.>");
		int num = sc.nextInt();
		
		switch(num/10) {
		case 10 :
		case 9 :
			System.out.println("당신의 학점은"+" "+"A");
			break ;
		case 8 :
			System.out.println("당신의 학점은"+" "+"B");
			break ;
		case 7 :
			System.out.println("당신의 학점은"+" "+"C");
			break ;
		case 6 :
			System.out.println("당신의 학점은"+" "+"D");
			break ;
		default :
			System.out.println("당신의 학점은"+" "+"F");
		}
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
