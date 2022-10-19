package chapter05;

public class ArrayEx10_1 {

	public static void main(String[] args) {

		int[] num = new int[10];
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] = (int)(Math.random()*10));
		}
		
		System.out.println();
		
		for(int i=0; i<num.length-1;i++) {
			if(num[i]>num[i+1]) {
				int temp = num[i] ;
				num[i] = num[i+1] ;
				num[i+1] = temp ;
			}
		}
		for(int i=0; i<num.length; i++)
			System.out.printf("%d, ",num[i]);
	}

}
