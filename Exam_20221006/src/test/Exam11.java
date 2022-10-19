package test;

	import java.util.*;

/*
 * 조건 연산자(if문)
 * if문, if~else, if~elseif~elseif~else(elseif 반복가능)   3가지 있다.
 */
public class Exam11 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in) ;
	
//	System.out.println("정수 입력");
	System.out.println("성적 입력");
	
	int num = sc.nextInt();
	
//	if(num>0)
//		System.out.println("양수");
//	if(num==0)
//		System.out.println("zero");
//	if(num<0)
//		System.out.println("음수");
//	if(num>=0)
//		System.out.println("양수");
//	else if(num==0)
//		System.out.println("zero");
//	else if(num<0)
//		System.out.println("음수");
	if(num>=90)
		System.out.println("A");
	else if(num>=80)
		System.out.println("B");
	else if(num>=70)
		System.out.println("C");
	else if(num>=60)
		System.out.println("D");
	else
		System.out.println("F");
	
	
		
	}
	
}
