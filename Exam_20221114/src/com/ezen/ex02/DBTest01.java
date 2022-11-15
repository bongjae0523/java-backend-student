package com.ezen.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class DBTest01 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	public static void main(String[] args) {

		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println(conn);
			
			String sql = "insert into member values(seq_member.nextval,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);  
			
			// sql 타입과 일치해야함
			pstmt.setString(1, "이순신"); //1번째 " "  입력하겠다.
			pstmt.setInt(2, 182);
			pstmt.setInt(3, 78);
			pstmt.setInt(4, 45);
			
			int num = pstmt.executeUpdate(); 
			System.out.println("insert: "+num);
			
//			행 삭제 하는 코드 만들기
			String sql3 = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql3);
			pstmt.setInt(1, 1004);
			num = pstmt.executeUpdate();
			System.out.println("delete: "+num);
			
//			출력하는 코드 만들기
			String sql2 = "select * from member order by id";
			pstmt = conn.prepareStatement(sql2);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getInt(3)+"\t");
				System.out.print(rs.getInt(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
