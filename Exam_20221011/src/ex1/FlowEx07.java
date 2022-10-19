package ex1;

import java.util.*;

/*
 * switch 
 */
public class FlowEx07 {

	public static void main(String[] args) {
		
		System.out.println("당신의 주민번호를 입력하세요. (012345-67890120)");
		
		Scanner sc = new Scanner(System.in) ;
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3' :
			System.out.println("당신은 남자입니다");
			break ;
		
		case '2': case '4' :
			System.out.println("당신은 여자입니다");
			break ;
		default :
			System.out.println("유효하지 않는 주민등록번호입니다");
		
		}
	}	
}
