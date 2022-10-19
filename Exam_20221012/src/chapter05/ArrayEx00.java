package chapter05;

public class ArrayEx00 {
	public static void main(String[] args) {
		
		int[] score = new int[6];
		
		for(int i=0; i<6; i++) {
			int n = (int)(Math.random()*45)+1 ;
			score[i] = n ;
//		}
//		for(int i=0; i<6; i++) {
			System.out.print(score[i]+",");
		}
		
		System.out.println();
		int a = score[0] ;
		int b = score[1] ;
		int c = score[2] ;
		int d = score[3] ;
		int e = score[4] ;
		int f = score[5] ;
		System.out.print(""+a+" ");
		System.out.print(""+b+" ");
		System.out.print(""+c+" ");
		System.out.print(""+d+" ");
		System.out.print(""+e+" ");
		System.out.print(""+f+" ");
	}
}
