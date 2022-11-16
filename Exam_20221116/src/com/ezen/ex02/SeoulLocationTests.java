package com.ezen.ex02;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocationTests {

	List<SeoulLocationVO> list = new ArrayList<SeoulLocationVO>(); 
	
	public static void main(String[] args){

		SeoulLocationTests se = new SeoulLocationTests();
		se.seoulLocation();
//		se.seoulLocationShow();
//		se.seoulNature();
		
	}
	
	public void seoulLocationShow() {
		
		System.out.println("----------------------------------------------");
		for(SeoulLocationVO sl : list) {
			System.out.println("번호: " + sl.getNo());
			System.out.println("명칭: " + sl.getName());
			System.out.println("설명: " + sl.getLocationComment());
			System.out.println("이용시간: " + sl.getLocationTime());
			System.out.println("주소: " + sl.getLocationAddress());
			System.out.println("교통정보: " + sl.getLocationTraffic());
			
			System.out.println("----------------------------------------------");
		}
	}
	
	public void seoulLocation() {
		
		DataDAO dao = DataDAO.newInstance(); //싱글톤 패턴 생성
		
		int no;
		String name;
		String locationComment;
		String locationTel;
		String locationTime;
		String locationAddress;
		String locationTraffic;
		
		try
		{
			int k=1;
			for(int i=1;i<=36;i++)
			{
			   Document doc=Jsoup.connect("https://korean.visitseoul.net/attractions?curPage="+i).get(); //명소 목록 페이지
			   Elements poster=doc.select("ul.article-list li.item div.thumb"); //썸네일 이미지
			   Elements comment=doc.select("ul.article-list li.item div.infor-element span.text-dot-d"); //썸네일 장소 설명
			   Elements link=doc.select("ul.article-list li.item a"); // 썸네일 장소 세부설명 링크
			   Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); //썸네일 장소 이름
			   for(int j=0;j<poster.size();j++)
			   {
				   try{
					   System.out.println("번호:"+k);
					   System.out.println(title.get(j).text()); //title의 텍스트만 추출 후 출력
//					   System.out.println(poster.get(j).attr("style")); // poster style의 속성값을 반환
//					   System.out.println(comment.get(j).text()); //장소를 설명하는 부분의 텍스트만 추출 후 출력
//					   System.out.println(link.get(j).attr("href")); // link의 url을 반환 후 출력
					   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();// 사진속 장소의 상세페이지
					   Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0); // 사진 속 장소의 주소 및 교통정보
					   System.out.println("주소:"+address.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   
					   Element comment2 = doc2.select("div.wide-inner div.text-area").get(0);
					   System.out.println("자세한 설명: " + comment2.text()); // doc2의 설명
					   
					   Element tel = doc2.select("div.detial-cont-element.active dl dd").get(0);
					   System.out.println("전화번호: " + tel.text()); //전화번호
					   
					   Element time = doc2.select("div.detial-cont-element.active dl dd").get(4);
					   System.out.println("이용시간: " + time.text()); // 이용시간
					   
					   Element traffic = doc2.select("div.detail-map-wrap dl dd").get(1);
					   System.out.println("교통정보: " + traffic.text()); // 교통정보
					   System.out.println("=========================================================");

//					   SeoulLocationVO -> 저장
					   no = k;
					   name = title.get(j).text();
					   locationComment = comment2.text();
					   locationTel = tel.text();
					   locationTime = time.text();
					   locationAddress = address.text();
					   locationTraffic = traffic.text();
					   
					   k++;
					   
//					   SeoulLocationVO sl에 각 변수 넣기.
					   SeoulLocationVO sl = new SeoulLocationVO();
					   sl.setNo(no);
					   sl.setName(name);
					   sl.setLocationComment(locationComment);
					   sl.setLocationTel(locationTel);
					   sl.setLocationTime(locationTime);
					   sl.setLocationAddress(locationAddress);
					   sl.setLocationTraffic(locationTraffic);
					   
//					   list.add(sl);
					   dao.seoulLocationInsert(sl);
					   
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
}