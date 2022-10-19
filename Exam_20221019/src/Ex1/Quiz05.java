package project01;

public class Quiz05 {

	public static void main(String[] args) {

		int[] num = new int[40]; //정수 int에 num이라는 변수를 선언. 40개의 배열로 초기화
		int i = 0 ;
		int j = 0 ;
		int[] hol = new int[40]; //홀수를 담는 배열 40개
		int[] jak = new int[40]; // 짝수를 담는 배열 40개
		int holCnt =0;
		int jakCnt =0;
		
		for(i=0; i <num.length; i++) { 
			num[i] = (int)(Math.random()*100+1); 
			// Math.random() 으로 0.0~0.999..의 수에 100을 곱하여
			// 0.0~99.999..를 만들고 +1을 하여 1.0~100.999..를 만든 뒤
			// (int) 정수로 바꾸어 1~100이 되도록한다.
			for(j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i-- ; 
					// num[i] 값과 num[j]의 값이 같으면 i를 1뺴고 다른 값이 나올떄까지 다시 돌림
					//ex) num[1] 갑과 num[1]의 값이 랜덤한 수 5로 같다면 num[1]을 다시 실행한다는 뜻
				}
			}
			System.out.printf("num[%d] = %d%n", i , num[i]);	
			// num변수 [0]부터 랜덤수 입력
		}
		System.out.println();
		
		for(i=0; i <num.length-1; i++) { 
			for(j=0; j<num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					int tmp;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				} // 배열 내림차순으로 정렬하기위함
				// num[j]이 num[j+1] 보다 크다면 자리 변경
				// ex) num[0]이 7, num[1]이 54 경우 작기때문에 실행되지 않음. 
			}
		}
		System.out.println();
		
		for(i=0; i<num.length; i++) {
			if(num[i]%2 == 1) {
				hol[holCnt] = num[i];
				holCnt++ ;
			} // 2로 나누었을때 나머지 1일 경우 num[i]는 hol[holCnt]로 이동
			// num[1] = 3 경우 hol[0] = 3이 되고 다음 저장되는 값은 holCnt++로 인해 hol[1]에 저장 // 이런식으로 반복
			else if(num[i]%2 == 0) {
				jak[jakCnt] = num[i];
				jakCnt++;
			}
		}
		System.out.print("홀수: ");

        for (i=0; i<hol.length; i++) {
        	if(hol[i] != 0) {
        		System.out.printf("%d, ",hol[i]);
        	}
        	else if(hol[i] == 0) {
        		System.out.print("");
        	} //hol[i]값이 0이 아닐경우만 출력되고 0일경우 공란.
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
