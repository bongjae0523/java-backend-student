package test;

import java.util.*;

/*
 * 두 정수를 입력받아서 합을 구하기
 */

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("구하고자 하는 값") ;
		System.out.print("A=");
		double str1 = sc.nextDouble() ;
		System.out.print("B=");
		double str2 = sc.nextDouble() ;
		
		double result = str1 +str2 ;
		
		System.out.printf("A+B=%f" , result);
		
			
	}

}
