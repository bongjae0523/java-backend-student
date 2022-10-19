package project01;

import java.util.Arrays;

public class Quiz6 {

   public static void main(String[] args) {

	   int[] num = new int[40];
	   int i = 0;
	   int j = 0;
	   
	   for(i=0; i <num.length; i++) {
		   num[i] = (int)(Math.random()*100+1) ;
		   for(j=0; j<i; j++) {
			   if(num[i] == num[j]) {
				   i-- ;
			   }
		   }
		   System.out.printf("num[%d] = %d%n", i, num[i]);
	   }
	   System.out.println();
	   
	   for(i=0; i<num.length-1; i++) {
		   for(j=0; j<num.length-1-i; j++) {
			   if(num[j]<num[j+1]) {
				   int tmp ;
				   tmp = num[j];
				   num[j] = num[j+1];
				   num[j+1] = tmp ;
			   }
		   }
		   System.out.println();
		   for(int k =0; k<num.length; k++)
			   System.out.print(num[k]+",");
	   }
	   
	   
   }

}