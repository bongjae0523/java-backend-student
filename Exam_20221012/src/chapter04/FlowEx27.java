package chapter04;

import java.util.Scanner;

public class FlowEx27 {
	public static void main(String[] args) {
		
	int num ;
	int sum = 0 ;
	boolean flag = true ; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("합계를 구할 숫자를 입력하시오(끝내려면 0을 입력)");
	
	while(flag) {
		System.out.print(">>");
		
		String tmp = sc.nextLine();
		num =Integer.parseInt(tmp);
		
		if(num !=0) {
			sum += num ; // sum = sum + num ;
		}
		else {
			flag = false ;
		}
	}
	
		System.out.println("합계 = " + sum);
	}
}
