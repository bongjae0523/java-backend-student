package test;

	import java.util.*;

/*
 * 절대값 출력 프로그램
 */
public class Exam10 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in) ;
	
	System.out.println("정수입력:");
	
	int num = sc.nextInt();
	int result ;
	
	if(num>0)
		result = num ;
	
	else
		result = num*(-1) ;
	
	System.out.println("num =" + result);
	System.out.println("--------------");
	
	int num2 = sc.nextInt();
	
	result = num2>0 ? num2 : num2*(-1) ;
	
	System.out.println("num2 = "+result);
	
		
	}
	
}
