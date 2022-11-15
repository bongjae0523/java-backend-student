package com.ezen.ex03;
/*
 * 별로 Member 클래스 작성해서 접근하기.
 * 아래 list 사용, for문 사용하여 입력하기
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBTest01 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	public static void main(String[] args) {

		List<Member> list = new ArrayList<>();
		
		list.add(new Member("이상호", 176,67,28));
		list.add(new Member("김윤아", 168,47,29));
		list.add(new Member("백수민", 178,67,26));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println(conn);
			
			String sql = "insert into member values(seq_member.nextval,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);  
			
			for(Member mem :list) {			
				pstmt.setString(1, mem.getName()); 
				pstmt.setInt(2, mem.getHeight());
				pstmt.setInt(3, mem.getWeight());
				pstmt.setInt(4, mem.getAge());
			
				int num = pstmt.executeUpdate(); 
				System.out.println("insert: "+num);
			}
			
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
