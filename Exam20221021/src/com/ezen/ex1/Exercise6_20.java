package com.ezen.ex1;

public class Exercise6_20 {

	public static void main(String[] args) {
		
	int[] original = {1,2,3,4,5,6,7,8,9};
	System.out.println(java.util.Arrays.toString(original));
		
	shuffle(original);
	System.out.println(java.util.Arrays.toString(original));
	
//	int[] result =  shuffle(original);
//	System.out.println(java.util.Arrays.toString(result));
	
	}

	static void shuffle(int[] dest) { // 참조변수 int[] 똑같이 써야함. => return 반환이 있을 경우.
		for(int i=0; i<dest.length; i++) { // 배열 섞기 for문
			int n = (int)(Math.random()*dest.length); // 새로운 변수 적용하여 배열 순서 바꾸기
				int tmp = dest[i];
				dest[i] = dest[n];
				dest[n] = tmp;
				
		}
//		return dest;	// 반환한다.
	}

}
