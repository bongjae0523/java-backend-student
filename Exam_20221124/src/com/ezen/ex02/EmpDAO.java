package com.ezen.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;		
	
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "1234";
	
	private static EmpDAO emp;
	
	
	public EmpDAO() { 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("------------연동 성공!----------");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static EmpDAO Instance() {
		if(emp == null)
			emp = new EmpDAO();
		
		return emp;
	}
	
	public List<EmpVO> empSelect() {
		
		List<EmpVO> list = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("conn = " + conn);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "select * from emp";
		
		try {
			pstmt = conn.prepareStatement(sql);
			System.out.println("pstmt = " + pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			rs = pstmt.executeQuery();
			System.out.println("rs = " + rs);
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				
//				System.out.print(rs.getInt(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getString(3)+"\t");
//				System.out.print(rs.getInt(4)+"\t");
//				System.out.print(rs.getString(5)+"\t");
//				System.out.print(rs.getInt(6)+"\t");
//				System.out.print(rs.getInt(7)+"\t");
//				System.out.print(rs.getInt(8)+"\t");
//				System.out.println();
				
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setHiredate(rs.getString(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
//				System.out.println(vo);
				
				list.add(vo);
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	return list;	
		
		
		
	}
	
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	
}
