package com.ezen.ex03;
/*
 * 클래스에 리스트 생성.
 * 크롤링하는 부분에 입력하고자 하는 변수 선언.
 * 각 변수에 맞는 값 넣기
 * SeoulHotelVO se 초기화
 * 각 변수를 SeoulHotelVO에 넣는다.
 * list에 넣는다.
 * 출력하는 부분을 만든다.
 * 
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx03 {

	//리스트 생성
	List<SeoulHotelVO> list = new ArrayList<SeoulHotelVO>(); 
	 
	public static void main(String[] args) throws IOException {
		
		CrawlingEx03 craw =  new CrawlingEx03();
		craw.seoulHotel();
		craw.seoulHotelShow();
		
		
	}
	
	//출력하는 부분
	public void seoulHotelShow() {
		
		System.out.println("----------------------------------------------");
		for(SeoulHotelVO sh : list) {
			System.out.println("번호: " + sh.getNo());
			System.out.println("호텔명: " + sh.getName());
			System.out.println("리뷰수: " + sh.getReviewCnt());
			System.out.println("리뷰평점: " + sh.getGradeCnt());
			System.out.println("주소: " + sh.getSeoulAddress());
			System.out.println("----------------------------------------------");
		}
		
		
	}
	
	//크롤링하는 부분
	public void seoulHotel(){
		
		
		
		int no; //번호
		String hotelname; //호텔명
		int reviewCnt; // 리뷰수
		Double gradeCnt; //리뷰평점
		String SeoulAddress; //주소
		
		try {
			int k=1;
			for(int i=1; i<=33; i++) {
				Document doc=Jsoup.connect("https://korean.visitseoul.net/hotels?curPage="+i).get();
				Elements poster=doc.select("ul.article-list li.item div.thumb img"); // 썸네일 이미지
				Elements link=doc.select("ul.article-list li.item a"); // 썸네일장소 세부설명 링크
				Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); // 호텔이름
//				Elements score=doc.select("div.infor-element-inner span.trip-ico img"); //평점
				Elements reviews=doc.select("span.trip-text"); //리뷰 수
				
				for(int j=0; j<poster.size(); j++) {
					try {
						   System.out.println("번호:"+k);
						   System.out.println(title.get(j).text());
						   System.out.println(poster.get(j).attr("src"));
						   System.out.println(link.get(j).attr("href"));
//						   System.out.println("score-alt" + score.get(j).attr("alt"));
						   String review = reviews.get(j).text();
						   System.out.println("리뷰 수: " + review.split(" ")[0]);
						   
						   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get(); 
						   Element address=doc2.select("div.detail-map-infor dl dd").get(0); //dd = 호텔 주소
						   Elements images=doc2.select("div.wide-slide div.item"); // 호텔 내부 이미지사진
						   Elements score=doc2.select("div.tripadvisor-wrap p.trip-infor img"); //평점
						   System.out.println("리뷰 평점: " + score.get(0).attr("alt").split(":")[1]);
//															----------------------------------------				   
//						   									평점: 4.5 라고 출력 되는데
//						   									.split(":")[1] 이라고 하면 :를 기점으로 좌측
//						   									.split(":")[0] 이라고 하면 우측
						   
//						   SeoulHotelVO -> 저장
						   no = k;
						   hotelname = title.get(j).text();
						   reviewCnt = Integer.parseInt(review.split(" ")[0]);
						   gradeCnt = Double.parseDouble(score.get(0).attr("alt").split(":")[1]);
						   
						   
						   
						   String simg="";
						   for(int m=0;m<images.size();m++)
						   {
//							   System.out.println(images.get(m).attr("style"));
							   String temp=images.get(m).attr("style");
							   // background-image:url(http://media-cdn.tripadvisor.com/media/photo-s/10/f5/38/a8/twin-rom--v17512289.jpg)"
							   // http://media-cdn.tripadvisor.com/media/photo-s/10/f5/38/a8/twin-rom--v17512289.jpg
							   temp=temp.substring(temp.indexOf("(")+1,temp.lastIndexOf(")"));
							   simg+=temp+"^";
						   }
						   simg=simg.substring(0,simg.lastIndexOf("^"));
						   System.out.println("주소:"+address.text());
						   
						   System.out.println();
						   k++;
						   
//						   SeoulHotelVO -> 저장
						   SeoulAddress = address.text();
						   
						   // SeoulHotelVO se 초기화.
						   SeoulHotelVO se = new SeoulHotelVO();
						   
						   // 각 변수를 SeoulHotelVO에 넣는다.
						   se.setNo(no);
						   se.setName(hotelname);
						   se.setReviewCnt(reviewCnt);
						   se.setGradeCnt(gradeCnt);
						   se.setSeoulAddress(SeoulAddress);
						   
						   //list에 넣는다.
						   list.add(se);
						   
						   
						   
					}catch(Exception e){
						e.printStackTrace();
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 서울 호텔목록 페이지
		
	}

	public void seoulAttractions() {
		
	}
	
	
	

}