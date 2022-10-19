package chapter05;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int[] c = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10); // 0~9 정수
			System.out.print(num[i]+",");
		}
		System.out.println();
		
		for(int i =0; i <num.length; i++) {
			c[num[i]]++;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(i + "의 개수"+ c[i]);
		}
		
	}

}
