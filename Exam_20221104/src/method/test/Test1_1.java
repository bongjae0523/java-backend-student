package method.test;

import java.util.Scanner;
/*
 * 아이디를 받아서 중복체크하는 메소드 작성
 */
public class Test1_1 {
	static String[] str = {"신봉재", "봉재", "신", "봉", "재"};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력하시오.");
		
		중복확인(sc.nextLine());
	}

	static void 중복확인(String 입력) {
		for(int i = 0; i<str.length; i++) {
			if(입력.equals(str[i])) {
				System.out.println("중복입니다.");
			}
		}
		System.out.println("입력하신 아이디는 " + 입력 + "입니다.");
	}
}
