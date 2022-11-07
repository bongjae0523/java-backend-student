package com.ezen.ex1;
/*
 * p633 예제 11-22
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		
		Set set = new HashSet();
//		Set set = new linkedhashSet();
		int[][] board = new int [5][5];
		
		for(int i = 0; set.size()<25; i++) {
			set.add((int)(Math.random()*50+1)+"");  // 정수 + ""(문자열) = 문자열
		}
		
		Iterator it  = set.iterator(); // 반환타입이 Object 이므로 아래 String타입으로 타입변환
		
		for(int i = 0; i<board.length; i++) {
			for(int j =0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] <10 ? "  " : " ") + board[i][j]);
											// 10보다 작으면 공란 두칸, 아니면 공란 한칸
			}
			System.out.println();
		}
		
	}
	
}
