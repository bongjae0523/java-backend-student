package ex1;

import java.util.*;

/*
 * 점수따른 학점 출력
 * 90:A , 80:B, 70:C, 60:D, F
 */
public class FlowEx02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt();

		if(num>=90)
			System.out.println("학점 A");
		else {
			if(num>=80)
				System.out.println("학점 B");
			else {
				if(num>=70)
					System.out.println("학점 C");
				else {
					if(num>=60)
						System.out.println("학점 D");
					else
						System.out.println("학점 F");
				}
			}
		}
		
//		if(num>=90)
//			System.out.println("학점 A");
//		else if(80<=num && num<90)
//			System.out.println("학점 B");
//		else if(70<=num && num<80)
//			System.out.println("학점 C");
//		else if(60<=num && num<70)
//			System.out.println("학점 D");
//		else
//			System.out.println("학점 F");
		
	}

}
