package test;

	import java.util.*;
	
public class Exam03 {

	public static void main(String[] args) {
		
		int num = 10 ;
		int num2 ;
		int num3 ;
		
		num2 = num++ ;
		num3 = ++num ;
		
		System.out.println(num );
		System.out.println(num2 );
		System.out.println(num3 );
		
		int age = 5;
		int n1 ;
		int n2;
		
		n1 = ++age ;
		n2 = age++ ;
		
		System.out.println(age + " " + n1 + " " + n2);
		
		int x =5 ;
		System.out.println( x = x++ - ++x);
		
	}
	
}
