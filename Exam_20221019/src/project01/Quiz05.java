package project01;

public class Quiz05 {

	public static void main(String[] args) {

		int[] num = new int[40];
		int i = 0 ;
		int j = 0 ;
		int[] hol = new int[40];
		int[] jak = new int[40]; 
		int holCnt =0;
		int jakCnt =0;
		
		//랜덤함수
		for(i=0; i <num.length; i++) { 
			num[i] = (int)(Math.random()*100+1); 
			//중복된 수 안나오게 하기 위함
			for(j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i-- ; 
				}
			}
			System.out.printf("num[%d] = %d%n", i , num[i]);	
		}
		System.out.println();
		
		//내림차순 정렬
		for(i=0; i <num.length-1; i++) { 
			for(j=0; j<num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					int tmp;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		
		// 홀수 짝수 각 배열에 넣기
		for(i=0; i<num.length; i++) {
			if(num[i]%2 == 1) {
				hol[holCnt] = num[i];
				holCnt++ ;
			} 
			else if(num[i]%2 == 0) {
				jak[jakCnt] = num[i];
				jakCnt++;
			}
		}
		System.out.print("홀수: ");
		
		// 0의 값을 가진 배열 안나오게 하기                                     
        for (i=0; i<hol.length; i++) {
        	if(hol[i] != 0) {
        		System.out.printf("%d, ",hol[i]);
        	}                                     
        	else if(hol[i] == 0) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        		System.out.print("");
        	} 
        }
        System.out.println();
        System.out.println("홀수 갯수 = "+holCnt);
        System.out.print("짝수: ");

        for (i=0; i<jak.length; i++) {
        	if(jak[i] != 0) {
        		System.out.printf("%d, ",jak[i]);
        	}
        	else if(jak[i] == 0) {
        		System.out.print("");
        	}
        }
        System.out.println();
        System.out.println("짝수 갯수 = "+jakCnt);
	}
}
