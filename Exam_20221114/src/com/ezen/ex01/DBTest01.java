package com.ezen.ex01;
/*
 * 연동 전에 lib연동해야함. 방법은 아래...
 * C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib  ojdbc6
 * lib 폴더에 복사
 * Project Explorer 에서 해당 폴더에서 우측버튼
 * Build path -> configure Build path -> Libraries -> Module path -> add
 * 연동되면 lib에 빗자루 모양 생김
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest01 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; //위와 같음
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
			System.out.println(conn);
			
			stmt = conn.createStatement();
			
			String sql = "insert into member values('0000','홍길동',170,78,26)";
			
			int num = stmt.executeUpdate(sql);
			System.out.println(num); //1이 나오면 성공 , 0이 나오면 실패
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
