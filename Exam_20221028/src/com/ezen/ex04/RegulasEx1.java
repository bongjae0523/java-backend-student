package com.ezen.ex04;

public class RegulasEx1 {

	public static void main(String[] args) {

		
		String[] str = {"absf12", "123456", "qwerty", "as5sf*", "345KOR"};
		
		String regex = "^[0-9a-zA-Z]{6}$";
		
		//matches(String regex) -> 인자로 넘어온 정규표현식과 일치하는지 여부를 판단한다.
		for(String data : str)
			System.out.printf("%s \t %b \n", data, data.matches(regex));
		
	}

}
