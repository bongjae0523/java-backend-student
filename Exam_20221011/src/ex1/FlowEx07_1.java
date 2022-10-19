package ex1;

import java.util.*;

/*
 * switch 
 */
public class FlowEx07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("당신의 주민번호를 입력하세요. (012345-67890120)");
		
		Scanner sc = new Scanner(System.in) ;
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3' :
			switch(gender) {
			case '1':
				System.out.println("2000년 이전 출생자인 남자");
				break ;
			case '3':
				System.out.println("2000년 이후 출생자인 남자");
			}
			break ;
		
		case '2': case '4' :
			switch(gender) {
			case '2':
				System.out.println("2000년 이전 출생자인 여자");
				break ;
			case '4':
				System.out.println("2000년 이후 출생자인 여자");
			}
			break ;
		default :
			System.out.println("유효하지 않는 주민등록번호입니다");
		
		}
	}	
}
