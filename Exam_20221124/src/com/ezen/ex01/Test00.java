package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test00 {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	ResultSet rs = null;		
	
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
		
//	Test00 test = new Test00();
	static Test00VO testvo = new Test00VO();
	static List list = new ArrayList();
	
	public Test00() { 
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
		
	public void Select() { 
		try {
			getConnection();
			
			String sql = "select * from emp";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				System.out.print(rs.getInt(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getString(3)+"\t");
//				System.out.print(rs.getInt(4)+"\t");
//				System.out.print(rs.getString(5)+"\t");
//				System.out.print(rs.getInt(6)+"\t");
//				System.out.print(rs.getInt(7)+"\t");
//				System.out.print(rs.getInt(8)+"\t");
//				
//				System.out.println();
				
				testvo.setEmpno(rs.getInt(1));
				testvo.setEname(rs.getString(2));
				testvo.setJob(rs.getString(3));
				testvo.setMgr(rs.getInt(4));
				testvo.setHiredate(rs.getString(5));
				testvo.setSal(rs.getInt(6));
				testvo.setComm(rs.getInt(7));
				testvo.setDeptno(rs.getInt(8));
				
			}
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	
	
	}
	
	public void get() {
	
		for (int i = 0; i < list.size(); i++) { 
			System.out.println("================================");
			System.out.println("empno: " + list.get(i));
			System.out.println("ename: " + list.get(i));
			System.out.println("job: " + list.get(i));
			System.out.println("mgr: " + list.get(i));
			System.out.println("hiredate: " + list.get(i));
			System.out.println("sal: " + list.get(i));
			System.out.println("comm: " + list.get(i));
			System.out.println("deptno: " + list.get(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Test00 test = new Test00();
		
		test.Select();
		
	}
}



