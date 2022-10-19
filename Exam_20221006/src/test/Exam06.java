package test;

	import java.util.*;
	
public class Exam06 {

	public static void main(String[] args) {
		
	int a = 5 ; 
	int b = 2 ;
	
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	
	String str1 = "korea" ;
	String str2 = "korea" ;
	String str3 = new String("korea") ;
	
	System.out.println("-----------");
	System.out.println(str1==str2);
	System.out.println(str1==str3);
	
	System.out.println("----------");
	System.out.println(str1.equals(str3)); // 문자는 equals 를 사용하여 확인하기
	System.out.println(str1.equals(str2));
	
	
		
	}
	
}
