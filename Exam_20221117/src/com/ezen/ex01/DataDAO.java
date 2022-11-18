package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private static DataDAO dao;
	
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	private DataDAO() { 
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
	
	public static DataDAO newInstance() { // 싱글톤 패턴
		if(dao == null)
			dao = new DataDAO();
		
		return dao;
	}
	
	public void NAVERVIBEInsert(NAVERVIBEVO nv) { //입력
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "insert into NAVERVIBE values(NAVERVIBE_sql.nextval,?,?,?)";
			
			//3.오라클로 sql문 전송
			pstmt = conn.prepareStatement(sql);
			//4.?값 저장
			
			pstmt.setString(1, nv.getNAVERVIBEtitle());
			pstmt.setString(2, nv.getNAVERVIBEartist());
			pstmt.setString(3, nv.getNAVERVIBEalbum());
			
			//5.전송된 값을 커밋 또는 업데이트
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}
	
	public void NAVERVIBESelect(NAVERVIBEVO nv) { //자바에 출력
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "select * from NAVERVIBE order by no";
			
			//3.오라클로 sql문 전송
			pstmt = conn.prepareStatement(sql);
			//4.?값 저장
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			
			//5.전송된 값을 커밋 또는 업데이트
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
	
	public void NAVERVIBEDelete(NAVERVIBEVO nv) { //삭제
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "delete from NAVERVIBE where no = ?";
			
			//3.오라클로 sql문 전송
			pstmt = conn.prepareStatement(sql);
			//4.?값 저장
			
			pstmt.setInt(1, 1);
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("delete: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
	
	public void NAVERVIBEUpdate(NAVERVIBEVO nv) { // 변경
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "update NAVERVIBE set NAVERVIBEtitle = '새삥' where NAVERVIBEartist = '지코 (ZICO)'";
			
			//3.오라클로 sql문 전송
			pstmt = conn.prepareStatement(sql);
			//4.?값 저장

			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("update: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
	
	
	
}













