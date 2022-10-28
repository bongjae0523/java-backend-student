package com.ezen.ex04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulasEx2 {

	public static void main(String[] args) {

		// .com으로 된 이메일 찾아라.
		String str = "sample01@naver.com,test01@gmail.com,test02@ezen.co.kr,test03@hrd.go.kr,apple01@apple.org";
		
		String regex = "([\\w]*@[\\w]*.com)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find())
			System.out.println(matcher.group());
	}

}
