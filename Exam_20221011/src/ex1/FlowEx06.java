package ex1;

import java.util.*;

/*
 * switch 
 * 로또
 */
public class FlowEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		for(int i=0; i<6; i++) {
			int com = (int)(Math.random()*45)+1;
		
		System.out.print(com + " ");
		}
	}	
}
