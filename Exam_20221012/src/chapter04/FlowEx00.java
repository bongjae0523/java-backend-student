package chapter04;

	import java.util.*;
	
/*
 * 정수 3개 입력 받아서 최대값과 최소값을 구하는 프로그램 작성
 */
public class FlowEx00 {

	public static void main(String[] args) {
		
		System.out.println("정수 3개를 입력하시오");
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("값입력 ");
		int num1 = sc.nextInt();
		System.out.print("값입력 ");
		int num2 = sc.nextInt();
		System.out.print("값입력 ");
		int num3 = sc.nextInt();
			
		if(num1>num2 && num1>num3)
			System.out.println("최대값은 "+ num1);
		else if(num2>num1 && num2>num3)
			System.out.println("최대값은 "+ num2);
		else if(num3>num1 && num3>num1)
			System.out.println("최대값은 "+ num3);
		
		if(num1<num2 && num1<num3)
			System.out.println("최소값은 "+ num1);
		else if(num2<num1 && num2<num3)
			System.out.println("최소값은 "+ num2);
		else if(num3<num1 && num3<num1)
				System.out.println("최소값은 "+ num3);
	}

}
