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
	private static final String user = "project";
	private static final String pwd = "1234";
	
	private DataDAO() { 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("------------연동 성공!----------");
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
	
	public void NAVERVIBECreate(NAVERVIBEVO nv) { //Top100 입력
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "insert into NAVERVIBE values(NAVERVIBE_sql.nextval,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, nv.getNAVERVIBEtitle());
			pstmt.setString(2, nv.getNAVERVIBEartist());
			pstmt.setString(3, nv.getNAVERVIBEalbum());
			
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
			
			String sql = "select * from NAVERVIBE order by no";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("select: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}

	public void NAVERVIBESelect2(NAVERVIBEVO nv) { //자바에 my list 출력
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "select * from NAVERVIBE_temp order by no";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("select: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		
	}
	
	public void NAVERVIBEDelete(NAVERVIBEVO nv, String name) { //삭제
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "delete from NAVERVIBE where NAVERVIBEartist = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("delete: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}

	public void NAVERVIBEDelete2(NAVERVIBEVO nv, String name) { //My list 삭제
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "delete from NAVERVIBE_temp where NAVERVIBEartist Like '%"+name+"%' ";
			
			pstmt = conn.prepareStatement(sql);
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("delete: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		
	}
	
	public void NAVERVIBEUpdate(NAVERVIBEVO nv,String name1, String name2) { // 변경
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "update NAVERVIBE set NAVERVIBEartist = ? where NAVERVIBEartist = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name1);
			pstmt.setString(2, name2);

			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("update: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}

	public void NAVERVIBEUpdate2(NAVERVIBEVO nv,String name1, String name2) { // My list  변경
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "update NAVERVIBE_temp set NAVERVIBEartist = ? where NAVERVIBEartist = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name1);
			pstmt.setString(2, name2);
			
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("update: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		
	}
	
	public void NAVERVIBELike(NAVERVIBEVO nv, String name) { // 특정 조회
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "select * from navervibe where navervibeartist Like '%"+name+"%' ";
			
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			
			int num = pstmt.executeUpdate();
			System.out.println("select: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}

	public void NAVERVIBELike2(NAVERVIBEVO nv, String name) { // My list 특정 조회
		try {
			//1. DB 연결
			getConnection();
			
			//2. sql문 작성
			String sql = "select * from navervibe_temp where navervibeartist Like '%"+name+"%' ";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			
			int num = pstmt.executeUpdate();
			System.out.println("select: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		
	}
	
	public void NAVERVIBECommit(NAVERVIBEVO nv) { // 커밋
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "commit";
			
			pstmt = conn.prepareStatement(sql);

			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("commit: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
	
	public void NAVERVIBERandom(NAVERVIBEVO nv, int num1) { // 랜덤
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "SELECT * FROM (SELECT *  FROM NAVERVIBE ORDER BY DBMS_RANDOM.RANDOM())WHERE ROWNUM <= ? order by no";
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, num1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("commit: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}

	public void NAVERVIBERandom2(NAVERVIBEVO nv, int num1) { // My list랜덤
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "SELECT * FROM (SELECT *  FROM NAVERVIBE_temp ORDER BY DBMS_RANDOM.RANDOM())WHERE ROWNUM <= ? order by no";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
			//5.전송된 값을 커밋 또는 업데이트
			int num = pstmt.executeUpdate();
			System.out.println("commit: "+num);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		
	}
	
	public void NAVERVIBEInsert(NAVERVIBEVO nv,String a,String b,String c) { //My list 내 손으로 입력
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "insert into NAVERVIBE_temp values(0,'"+a+"','"+b+"','"+c+"')";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}

	public void NAVERVIBEInsert2(NAVERVIBEVO nv,int num) { //My list 번호로 저장
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "insert into NAVERVIBE_temp "
					+ "select no,NAVERVIBEtitle,NAVERVIBEartist,NAVERVIBEalbum "
					+ "from NAVERVIBE "
					+ "where no=?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}
	
	public void NAVERVIBEDrop(NAVERVIBEVO nv) { // 초기화하기 위한.
		try {
			//1. DB 연결
			getConnection();
			
			String sql = "delete from NAVERVIBE"; //행 삭제 문구
			
			pstmt = conn.prepareStatement(sql);

			int num1 = pstmt.executeUpdate();
			System.out.println("update: "+num1);

			String sql2 = "drop sequence NAVERVIBE_sql"; //시퀀스 삭제
			
			pstmt = conn.prepareStatement(sql2);
			
			int num2 = pstmt.executeUpdate();
			System.out.println("update: "+num2);

			String sql3 = "create sequence NAVERVIBE_sql\r\n" 
					+ "    INCREMENT by 1\r\n"
					+ "    start with 1\r\n"
					+ "    MAXVALUE 100\r\n"
					+ "    MINVALUE 1\r\n"
					+ "    NOCYCLE"; //시퀀스 생성
			
			pstmt = conn.prepareStatement(sql3);
			
			int num3 = pstmt.executeUpdate();
			System.out.println("update: "+num3);
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
}













