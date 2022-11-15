package com.ezen.ex01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {

	public static void main(String[] args) {

		String url = "https://finance.naver.com/sise/sise_market_sum.naver";
		Document doc = null;
		
		try {
			
//			url 가져오기
			doc = Jsoup.connect(url).get();
//			System.out.println(doc);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		class의 type_s를 가져와라 // Elements는 중복된 데이터가 있을 수 있으므로 복수 배열로 넘겨준다.
		Elements elements = doc.getElementsByAttributeValue("class", "type_2");
//		System.out.println(elements);
		
//		0번째 방을 가져온다. 방이 한개밖에 없어서 현재 뭔가 바뀌지는 않는다. // 복수를 단수로 넘겨준다.
		Element element =elements.get(0);
//		System.out.println(element);
		
//		td a 를 출력하라.
		Elements elements2 = element.select("td a");
//		System.out.println(elements2);
		
//		td a에서 0번째 출력 // .text()를 하면 문자로 출력해라
		Element element2 = elements2.get(0);
//		System.out.println(element2); // 코드
		System.out.println(element2.text()); // 문자
		
		String no = element2.attr("href"); // html 속성을 가져온다. // 링크를 가져온다.
//		System.out.println(no);
		
//		System.out.println(no.lastIndexOf("=")); //lastIndexOf("=") =의 인덱스 넘버를 알려줌
		System.out.println(no.substring(no.lastIndexOf("=")+1)); // =의 인덱스 넘버 다음부터 출력하라. 
		
//		가격 나타내기
		Elements price = element.select("td.number");
		System.out.println(price.get(0).text());
		
		
	}

}
