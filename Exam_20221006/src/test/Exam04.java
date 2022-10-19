package test;

	import java.util.*;
	
/*
 *  키보드로 4000 입력 받는다. (4000초)
 *  사칙연산을 이용하여 시 분 초 로 변경
 *  1시 6분 40초
 */
public class Exam04 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in) ;
//		
//		System.out.print("몇 초?") ;
//		
//		int t = sc.nextInt();
////		
//		int h = t / 60 / 60 ;
//		int m = t / 60 % 60 ;
//		int s = t % 60 ;
//		
//		System.out.printf("%d %d %d" , h , m ,s);
		
//		int hour ;
//		int min ;
//		int sec ;
//		sec = t % 60 ; //시간
//		min = t / 60 ; // 분
//		hour = min / 60 ; //초
//		min = min % 60 ; 
//		System.out.println("입력 : " + t);
//		System.out.println(hour + "시간" + min + "분" + sec + "초");
		
		int a = 1000000;
		int result1 = (int) ((long)a*a/a) ;
				
				System.out.println(result1);
	}
	
}
