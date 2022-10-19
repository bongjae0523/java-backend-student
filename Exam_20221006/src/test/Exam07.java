package test;

	import java.util.*;
	
public class Exam07 {

	public static void main(String[] args) {
		
	System.out.println(5>2 && 2<5);
	System.out.println(5>2 && 2>5);
	System.out.println(5<2 && 2<5);
	System.out.println(5<2 && 2>5);
	
	int num1 = 4;
	
	if(num1 %2 == 0 && num1 %3 == 0) ;
	System.out.println("2의 배수이면서 동시에 3의 배수");
	
	if(num1 %2 == 0 || num1 %3 == 0) ;
	System.out.println("2의 배수이거나 동시에 3의 배수");
		
	System.out.println(num1 %3 == 0 || num1 %2 == 0);
	
		
	}
	
}
