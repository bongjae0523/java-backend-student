package com.ezen.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NAVERVIBETest {

	List<NAVERVIBEVO> list = new ArrayList<NAVERVIBEVO>();
	
	
	
	
	public void NAVERVIBEShow() {
		
		System.out.println("---------------------------------------");
		for(NAVERVIBEVO nvv : list) {
			System.out.println("번호: " + nvv.getNo());
			System.out.println("노래 제목: " + nvv.getNAVERVIBEtitle());
			System.out.println("가수: " + nvv.getNAVERVIBEartist());
			System.out.println("앨범명: " + nvv.getNAVERVIBEalbum());
			System.out.println("-----------------------------------");
		}	
	}
	
	public void NAVERVIBE() {
		
		int k = 1;
		
		DataDAO dao = DataDAO.newInstance();
		
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get(); //음원 페이지
		 
			Elements top = doc.select("div#conts h2.title"); // Top100 
			System.out.println(top.get(0).text()); // Top100 출력
			
			Elements poster = doc.select("div#conts div#tb_list div.wrap a span.bg_album_frame"); //포스터 이미지 코드
//			System.out.println(poster.size()); //100개
			Elements title = doc.select("div#conts div.wrap_song_info div.ellipsis.rank01 span a"); //노래 제목 코드
			Elements artist = doc.select("div#conts div.wrap_song_info span.checkEllipsis "); //가수 코드
			Elements album = doc.select("div#conts td:eq(6) div.ellipsis.rank03"); //앨범명 코드
			
			NAVERVIBEVO nv = new NAVERVIBEVO();
			
			for(int i = 0; i < poster.size(); i++) {
//				System.out.println("번호: " + k);
//				System.out.println(poster.get(i).attr("href")); //포스터 href 출력
				System.out.println("노래 제목: " + title.get(i).text()); //노래 제목 출력
				System.out.println("가수: " + artist.get(i).text()); //가수 출력
				System.out.println("앨범명: " + album.get(i).text()); //앨범명 출력
				System.out.println("===============================================================");
				
				nv.setNo(k);
				nv.setNAVERVIBEtitle(title.get(i).text());
				nv.setNAVERVIBEartist(artist.get(i).text());
				nv.setNAVERVIBEalbum(album.get(i).text());
				
				list.add(nv);
				
				k++;
				
				dao.NAVERVIBECreate(nv);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void NAVERVIBED(String name) {  //삭제
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEDelete(nv,name); //삭제
		
	}

	public void NAVERVIBED2(String name) {  // My list삭제
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEDelete2(nv,name); //삭제
		
	}
	
	public void NAVERVIBES() { //조회
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBESelect(nv); //조회
		
	}

	public void NAVERVIBES2() { //My list 조회
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBESelect2(nv); //조회
		
	}
	
	public void NAVERVIBEU(String name1, String name2) { //수정
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEUpdate(nv,name1,name2); //수정
		
	}

	public void NAVERVIBEU2(String name1, String name2) { // My list 수정
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEUpdate2(nv,name1,name2); //수정
		
	}

	public void NAVERVIBEL(String name) { //특정 검색
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBELike(nv, name); //검색
		
	}

	public void NAVERVIBEL2(String name) { // My list 특정 검색
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBELike2(nv, name); //검색
		
	}

	public void NAVERVIBER(int num) { //랜덤노래 뽑기
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBERandom(nv, num); //랜덤추천
		
	}

	public void NAVERVIBER2(int num) { //My list 랜덤노래 뽑기
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBERandom2(nv, num); //랜덤추천
		
	}

	public void NAVERVIBEC() { //커밋
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBECommit(nv); //커밋
		
	}
	
	public void NAVERVIBEI(String name1, String name2,String name3) { // My list 내 손으로  추가
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEInsert(nv,name1,name2,name3); //수정
		
	}

	public void NAVERVIBEI2(int num) { // My list 번호로 추가
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEInsert2(nv,num); //수정
		
	}
	
	public void NAVERVIBEInitialization() { //초기화
		DataDAO dao = DataDAO.newInstance();
		
		NAVERVIBEVO nv = new NAVERVIBEVO();
		
		dao.NAVERVIBEDrop(nv);; //초기화
		
	}
	
}
