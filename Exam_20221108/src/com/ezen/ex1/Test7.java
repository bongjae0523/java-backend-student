package com.ezen.ex1;
/*
 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
 * 90이상이면 A
 * 80이상이면 B
 * 70이상이면 c
 * 60이상이면 d
 * 나머지는 f
 */
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		System.out.println("점수 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
		int math = sc.nextInt();
		
		int avg = (int)((kor+eng+math)/3.0);
		
		if(avg >= 90)
			System.out.println("A");
		else if(avg >=80)
			System.out.println("B");
		else if(avg >=70)
			System.out.println("C");
		else if(avg >=60)
			System.out.println("D");
		else
			System.out.println("F");
		
		System.out.println("총점" + (kor+eng+math));
		System.out.println("평균" + avg);
		
		
		
		
		
		
	}

}