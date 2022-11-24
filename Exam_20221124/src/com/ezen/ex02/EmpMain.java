package com.ezen.ex02;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		
		EmpDAO emp = EmpDAO.Instance();
		List<EmpVO> st = emp.empSelect();
		
		for(EmpVO vo : st) {
			System.out.print(vo.getEmpno()+"\t");
			System.out.print(vo.getEname()+"\t");
			System.out.print(vo.getJob()+"\t");
			System.out.print(vo.getMgr()+"\t");
			System.out.print(vo.getHiredate()+"\t");
			System.out.print(vo.getSal()+"\t");
			System.out.print(vo.getComm()+"\t");
			System.out.print(vo.getDeptno()+"\t");
			System.out.println();
		}
		
	}
	
}



