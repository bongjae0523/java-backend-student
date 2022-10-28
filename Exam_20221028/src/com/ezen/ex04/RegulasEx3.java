package com.ezen.ex04;

public class RegulasEx3 {

	public static void main(String[] args) {

		
		String str[] = {"sample01avercom" ,"testdfa301gmailcom" , "test02@eze504o.kr" , "test03@hrd.go.kr" , "apple01@apple.org"};
		
		String regex = "[0-9]";

		for(String data : str)
			System.out.printf("%s \t %s \n", data, data.replaceAll(regex, "*"));

		String regex2 = "[^0-9]"; //^ 부정 -> 0-9가 아닌 것
		
		for(String data : str)
			System.out.printf("%s \t %s \n", data, data.replaceAll(regex2, "*"));
		
		
		
	}

}
