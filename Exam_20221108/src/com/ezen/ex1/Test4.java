package com.ezen.ex1;
/*
 * 세개의 정수를 입력받아, 그 수들의 최대값 최소값, 합계, 평균
 */
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		System.out.println("정수 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
	
		int sum = num1+num2+num3;
		double avg = sum/3f;
		int max = num1;
		int min = num1;
		
		max = (num1>num2) ? (num1>num3 ? num1 : num3) : ((num2 > num3)?num2:num3);
		min = (num1>num2) ? (num2>num3 ? num3 : num2) : ((num1 > num3)?num3:num1);
		
		
//		if(num1>num2) {
//			if(num1>num3) {
//				max = num1;
//				if(num2>num3) {
//					min = num3;
//				}
//				else {
//					min = num2;
//				}
//			}
//		}
//		else {
//			if(num2> num3) {
//				max = num2;
//				if(num3>num1) {
//					min = num1;
//				}
//				else {
//					min = num3;
//				}
//			}
//			else {
//				max = num3;
//				min = num1;
//			}
//		}
		
		
		System.out.println("합계" + sum);
		System.out.println("평균값" + avg);
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);
		
		
	}
}
