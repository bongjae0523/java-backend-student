package com.ezen.ex01;

public class SeoulLocationVO {

	private int no; // 번호
	private String name; //명칭
	private String locationComment; //자세한 설명
	private String locationTel; // 전화번호
	private String locationTime; //이용시간
	private String locationAddress; //주소
	private String locationTraffic; //교통상황
	
	public SeoulLocationVO() {	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationComment() {
		return locationComment;
	}

	public void setLocationComment(String locationComment) {
		this.locationComment = locationComment;
	}

	public String getLocationTel() {
		return locationTel;
	}

	public void setLocationTel(String locationTel) {
		this.locationTel = locationTel;
	}

	public String getLocationTime() {
		return locationTime;
	}

	public void setLocationTime(String locationTime) {
		this.locationTime = locationTime;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getLocationTraffic() {
		return locationTraffic;
	}

	public void setLocationTraffic(String locationTraffic) {
		this.locationTraffic = locationTraffic;
	}	
		
	

}
