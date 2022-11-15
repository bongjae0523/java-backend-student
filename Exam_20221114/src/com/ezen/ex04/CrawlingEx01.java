package com.ezen.ex04;
/*
 * url 소스 불러오기
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {

	public static void main(String[] args) {

		String url = "https://sports.news.naver.com/kfootball/index";
		Document doc = null;
		
		try {
//		url의 코드 불러오기
			doc = Jsoup.connect(url).get();
//			System.out.println(doc);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		url 중 원하는 구간 코드 불러오기
		Elements elements = doc.select("div.home_news"); // . -> class // # -> id 를 뜻한다.
		System.out.println(elements);
		
//		url 중 원하는 구간의 제목
		String name = elements.select("h2").text();
		System.out.println(name);
		System.out.println("---------------------------------");
		
//		url 중 원하는 구간의 내용
		for(Element el : elements.select("li")) {
			System.out.print(el.text());
			System.out.println();
		}
		
		
		
		
		
	}

}
