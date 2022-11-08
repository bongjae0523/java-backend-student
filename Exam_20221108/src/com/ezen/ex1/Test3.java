package com.ezen.ex1;
/*
 * 1학년부터 4학까지
 * 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격
 * 점수 0미만 100초과이면 경고문구
 */
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학년 입력하시오.");
		int grade = sc.nextInt();
		
		System.out.println("점수 입력하시오.");
		int score = sc.nextInt();
		
		if(grade == 4) {
			if(score >= 70 && score <= 100) {
				System.out.println("합격");
			}
			else if(score < 70 && score >= 0) {
				System.out.println("불합격");
			}
			else {
				System.out.println("다시 입력");
			}
		}
		else if(grade >=1 && grade<=3) {
			if(score >= 60 && score <= 100) {
				System.out.println("합격");
			}
			else if(score < 60 && score >= 0) {
				System.out.println("불합격");
			}
			else {
				System.out.println("다시 입력");
			}
		}
		else
			System.out.println("다시 입력하시오");
		
		
	}

}
