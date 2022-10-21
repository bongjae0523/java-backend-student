package com.ezen.ex1;

public class Exercise6_22 {

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = null;
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}	

	static boolean isNumber(String str) {
		
		if(str == null || str.equals(""))
			return false;
		
		for(int i= 0; i<str.length(); i++) { // charAt() 문자열에서 문자 하나 출력
			char tmp = str.charAt(i);
			if(tmp < '0' || tmp > '9' ) { //아스키코드 '0'보다 작거나 '9'보다 클때 false
				return false;
			}
		} return true;
	}

}
