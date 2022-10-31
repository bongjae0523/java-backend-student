package com.ezen.ex01;

// StringBuilder 클래스 이용해서
// 990915-1012999 --> 990915 1012999

public class TestEx01 {

	public static void main(String[] args) {

		// StringBuffer 와 StringBuilder 똑같은 기능으로 작성되어 있다.
		StringBuilder sb = new StringBuilder("990915-1012999");
		
		System.out.println(sb);

		System.out.println(sb.replace(6, 7, " ")); // 6번째 자리부터 7번째 자리 전까지 " " 으로 변경
		System.out.println("-------------------");
		
		
		String str =  new String("990915-1012999");
		System.out.println(str);
		
		str.replace("-"," ");
		System.out.println(str);
		// str의 값을 변화해주지는 않는다.
		
		String str2 = str.replace("-"," ");
		System.out.println(str2);
		
	}

}
