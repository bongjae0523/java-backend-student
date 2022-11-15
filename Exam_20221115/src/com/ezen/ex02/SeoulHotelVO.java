package com.ezen.ex02;

public class SeoulHotelVO {

	private int no; //번호
	private String hotelname; //호텔명
	private int reviewCnt; // 리뷰수
	private Double gradeCnt; //리뷰평점
	private String SeoulAddress; //주소
	
	public SeoulHotelVO(){}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return hotelname;
	}
	public void setName(String hotelname) {
		this.hotelname = hotelname;
	}
	public int getReviewCnt() {
		return reviewCnt;
	}
	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}
	public Double getGradeCnt() {
		return gradeCnt;
	}
	public void setGradeCnt(Double gradeCnt) {
		this.gradeCnt = gradeCnt;
	}
	public String getSeoulAddress() {
		return SeoulAddress;
	}
	public void setSeoulAddress(String seoulAddress) {
		SeoulAddress = seoulAddress;
	}
	
	
	
	
	
	
	
	
}

