package chapter04;

import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		
		System.out.println("*을 출력할 라인의 수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt() ;
		
		for(int i =0; i<=num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*"); 
			}
		
		System.out.println();
		}
	}	
}