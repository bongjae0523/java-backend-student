package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMemberEx01 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	public static void main(String[] args) {

		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공"); 
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 연결 성공");
			
			stmt = conn.createStatement();
			
			// 처음 key값을 중복허용을 안했기때문에 안바꿔주면 에러. // sql입력.
			String sql = "insert into member values('0007','한수수', 189, 27, 57)";
			
			int num = stmt.executeUpdate(sql); //.executeUpdate 넣는것
			System.out.println("insert 성공: " + num); //1이 나오면 성공 , 0이 나오면 실패
			System.out.println("--------------------------------");
			
			//sql2는 읽어오는것을 해봄.
			String sql2 = "select * from member order by id";
			rs = stmt.executeQuery(sql2);//.executeQuery 꺼내는것
			
			System.out.println("아이디   이름   키   몸무게   나이");
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("height")+"\t");
				System.out.print(rs.getInt("weight")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.println();
			}
			
			// 3번 변경하는 문장 넣고 실행.
			String sql3 = "update member set name = '윤재문' where id = '0003' ";
			int num2 = stmt.executeUpdate(sql3);
			System.out.println("update 성공: " + num2);
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
