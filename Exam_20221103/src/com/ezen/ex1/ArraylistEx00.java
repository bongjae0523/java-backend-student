package com.ezen.ex1;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx00 {

	public static void main(String[] args) {

		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		System.out.println(source.length());
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT +10); //크기를 약간 여유있게 잡는다
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT)); // i부터 i+LIMIT 사이를 반환한다.
			}	
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
