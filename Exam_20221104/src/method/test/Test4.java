package method.test;

import java.util.Scanner;
/*
 * 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
 * 2월 29일까지 있는 년도를 윤년이라 한다.
 * 윤년은 해당 연도를 4로 나눈값이 0.
 * 그 중 100으로 나눈 값이 0이 아닌 것은 제외.
 * 400으로 나눈 값이 0인 것은 포함.
 */
public class Test4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도 입력");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		} 
		else {
			System.out.println(year + "년은 평년");
		}	
		
	}
}
