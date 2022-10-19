package ex1;

import java.util.*;

/*
 * switch 
 */
public class FlowEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1번 입력");
			break ;
		case 2 :
			System.out.println("2번 입력");
			break ;
		case 3 :
			System.out.println("3번 입력");
			break ;
		case 4 :
			System.out.println("4번 입력");
			break ;
		default :
			System.out.println("1~4외 입력");
		}

		System.out.println("프로그램 종료");
		
	}

}
