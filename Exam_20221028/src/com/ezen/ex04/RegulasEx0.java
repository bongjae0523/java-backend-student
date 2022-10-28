package com.ezen.ex04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulasEx0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(str);
		
		System.out.println(m.find());
		
	}

}
