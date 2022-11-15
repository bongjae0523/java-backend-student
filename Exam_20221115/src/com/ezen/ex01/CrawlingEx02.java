package com.ezen.ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx02 {

	public static void main(String[] args) throws IOException {

		int pages = 5;
		
		for(int i = 0; i<pages; i++) {
			
			//네이버 - 경제 - 금융카테고리
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=259&sid1=101&mid=shm&date=20220501&page="+ i;
			
			Document doc = Jsoup.connect(url).get();
//			System.out.println(doc);
			
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
//			System.out.println(elements);

			Element element = elements.get(0);
//			System.out.println(element);
			
			Elements photoelements = element.getElementsByAttributeValue("class", "photo");
//			System.out.println(photoelements);
//			System.out.println(photoelements.size());
			
			for(int j = 0; j < photoelements.size(); j++) {
				Element newelement = photoelements.get(j);
//				System.out.println(newelement);
				
				Elements a_newelements = newelement.select("a");
				Element a_newelement = a_newelements.get(0);
//				System.out.println(a_newelement);
				
				String newURL = a_newelement.attr("href"); //기사 링크
//				System.out.println(newURL);
				
				Elements imgelements = newelement.select("img");
				Element imgelement = imgelements.get(0);
//				System.out.println(imgelement);
				String imgURL = imgelement.attr("src"); //이미지 링크
//				System.out.println(imgURL);
				
				String title = imgelement.attr("alt"); //기사 제목
				System.out.println(title);
				
				Document detailDoc = Jsoup.connect(newURL).get();
//				System.out.println(detailDoc);
				
				Element contentmement = detailDoc.getElementById("dic_area");
				String content = contentmement.text(); //상세기사...
				System.out.println(content);
				System.out.println("--------------------------------------------------------------");
				
			}
		}
	}
}
