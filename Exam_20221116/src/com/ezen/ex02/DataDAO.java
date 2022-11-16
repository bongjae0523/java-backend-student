package com.ezen.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private static DataDAO dao; // 아래 public static DataDAO newInstance() 위해서 static를 붙임.
	
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	private DataDAO() { //private 접근자 //싱글톤패턴을 요구.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url,user,pwd);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataDAO newInstance() { // 싱글톤 패턴 // 객체 생성 전에 접근하기 위해 static 접근자
		if(dao == null)
			dao = new DataDAO();
		
		return dao;
	}
	
	public void seoulLocationInsert(SeoulLocationVO se) {
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "insert into seoulLocation values(SeoulLocation_sql.nextval,?,?,?,?,?,?)";
			
			//3.오라클로 sql문 전송
			pstmt = conn.prepareStatement(sql);
			//?값 저장
			
			pstmt.setString(1, se.getName());
			pstmt.setString(2, se.getLocationComment());
			pstmt.setString(3, se.getLocationTime());
			pstmt.setString(4, se.getLocationAddress());
			pstmt.setString(5, se.getLocationTel());
			pstmt.setString(6, se.getLocationTraffic());
			
			//5.전송된 값을 커밋 또는 업데이트
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}
	
	
	
	
}













