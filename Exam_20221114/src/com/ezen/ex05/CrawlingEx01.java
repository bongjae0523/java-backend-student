package com.ezen.ex05;
/*
 * url 소스 불러오기
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {

	public static void main(String[] args) {

		String url = "https://finance.naver.com/item/main.naver?code=000660";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
//			System.out.println(doc);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select("div.wrap_company");
//		System.out.println(elements);
		
		Element element = elements.get(0);
		System.out.println(element);
		System.out.println("------------------------------------------");
		
		String name = element.select("h2").text();
		System.out.println(name);
		
		String id = element.select("span.code").text();
		System.out.println(id);
		
		String id2 = element.select("p.no_today").text();
		System.out.println(id2);
		
		for(Element els : element.select("p.no_today")) {
			System.out.print(els.text());
			System.out.println();
		}
		
//		System.out.println(name + "(" + id + ")");
		
//		elements = doc.select("div#fav_kospi");
//		System.out.println(elements);
//		System.out.println("---------------------------------------");
//		
//		Element el = elements.get(0);
//		System.out.println(el);
//		
//		String name2 = el.select("th.no10").text();
//		System.out.println(name2);
//		
//		String id2 = el.select("td").text();
//		System.out.println(id2);
//
//		for(Element els : elements.select("td")) {
//			System.out.print(els.text());
//			System.out.println();
//		}
		
		
//		Elements els = elements.select("th.no10");
//		System.out.println(els.get(0).text());
		
		
		
		
		
		
		
	}

}
