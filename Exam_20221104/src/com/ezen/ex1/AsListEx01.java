package com.ezen.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListEx01 {

	public static void main(String[] args) {
		
		//배열 생성 후 초기화
		String[] str = new String[5];
		str[0] = "kor1";
		str[1] = "kor2";
		str[2] = "kor3";
		str[3] = "kor4";
		str[4] = "kor5";
		
		//배열 생성하며 초기화
		String[] str2 = {"kor1", "kor1", "kor2", "kor3", "kor4"};
		System.out.println(Arrays.toString(str2));

		// List 사용 - 생성 후 초기화는 따로해야함.
		List<String> list = new ArrayList<>();
		list.add("kor1");
		list.add("kor2");
		list.add("kor3");
		
		Iterator<String> t = list.iterator();
		while(t.hasNext()) System.out.print(t.next() + '\t');
		System.out.println();
		
		// List - asList 사용해서 생성하며 초기화 가능. //단, 추가는 불가하다.
		List<String> list2 = Arrays.asList("kor", "eng", "math", "tot", "avg");
//		list2.add("toto");
		Iterator<String> t2 = list2.iterator();
		while(t2.hasNext()) System.out.print(t2.next() + '\t');
		System.out.println();
		
		// 위 추가를 위해서는 new ArrayList<>() 객체 해서 추가하면 가능함.
		List<String> list3 = Arrays.asList("kor", "eng", "math", "tot", "avg");
		list3 = new ArrayList<>(list2);
		list3.add("toto");
		
		Iterator<String> t3 = list3.iterator();
		while(t3.hasNext()) System.out.print(t3.next() + '\t');
		
	}

}
