package chapter05;

public class ArrayEx10_2 {

	public static void main(String[] args) {

		int[] num = new int[10];
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] = (int)(Math.random()*10));
		}
		
		System.out.println();
		
		for(int i=0; i<num.length-1;i++)
			for(int j=0; j<num.length-1-i; j++) {
			if(num[j]>num[j+1]) {
				int temp = num[j] ;
				num[j] = num[j+1] ;
				num[j+1] = temp ;
			}
		}
		for(int i=0; i<num.length; i++)
			System.out.printf("%d, ",num[i]);
	}

}
