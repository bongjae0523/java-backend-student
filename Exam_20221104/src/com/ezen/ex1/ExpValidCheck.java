package com.ezen.ex1;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

	public static void main(String[] args) {

		if(args.length !=1) {
			System.out.println("usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:"+expression);
		
		try {
			for(int i=0; i < expression.length(); i++) {
				char ch = expression.charAt(i); 
								// charAt() 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌
				
				if(ch =='(') {
					st.push(ch+"");
				}
				else if(ch == ')') {
					st.pop();
				}
			}
			if(st.isEmpty()) { //isEmpty는 문자열의 길이가 0인 경우에, true를 리턴
				System.out.println("괄호가 일치합니다.");
			}
			else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		} //try
		
		
		
		
	}

}
