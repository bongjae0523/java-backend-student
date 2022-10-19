package chapter05;
/*
 * 배열의 복사
 */
import java.util.Arrays;

public class ArrayEx00 {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50} ;
		
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
//		int[] DestNum = new int[10] ;
		int[] destNum = new int[num.length*2] ;
		
		for(int i=0; i<num.length; i++) 
			destNum[i] = num[i] ;
			
		for(int i=num.length; i<destNum.length; i++) 
			//num.length = 5 / destNum.length = 10
			destNum[i]= 10*(i+1) ;
			
		
		System.out.println(Arrays.toString(destNum));
		System.out.println("-------------------------------------------");
		
		int[] num2 = new int[num.length*2];
		
//		System.arraycopy(num2, 0, destNum, 0, 0);
		System.arraycopy(num, 0, num2, 0, num.length);
		System.out.println(Arrays.toString(num2));
	}

}
