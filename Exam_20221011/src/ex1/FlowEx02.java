package ex1;

import java.util.*;

public class FlowEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input ;
		
		System.out.println("숫자를 하나 입력하세요.>");
		
		Scanner sc = new Scanner(System.in) ;
//		String tmp = sc.nextLine(); // 입력한 내용을 tmp에 저장
//		input = Integer.parseInt(tmp) ; // 입력받은 문자열(tmp) 숫자로 변환(Integer.parseInt()
		input = sc.nextInt() ;
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다", input);
			
		}
	}

}
