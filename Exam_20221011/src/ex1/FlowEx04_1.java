package ex1;

import java.util.*;

/*
 * switch 
 */
public class FlowEx04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		
		String num = sc.nextLine();
		
		switch(num) {
		case "aaa" :
			System.out.println("aaa번 입력");
			break ;
		case "bbb" :
			System.out.println("bbb번 입력");
			break ;
		case "ccc" :
			System.out.println("ccc번 입력");
			break ;
		case "ddd" :
			System.out.println("ddd번 입력");
			break ;
		default :
			System.out.println("그 외 입력");
		}

		System.out.println("프로그램 종료");
		
	}

}
