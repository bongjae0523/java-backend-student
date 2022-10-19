package chapter05;

public class ArrayEx00_05_06 {

	public static void main(String[] args) {
		
		int[] num = new int[10] ;
		
		
		//배열 저장(random 이용.. 1~100 사이)
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1 ;
		}
		//합계
		int sum = 0 ; //지역 변수 
		double average = 0 ;

		for(int i=0; i<num.length; i++) {
			sum += num[i]  ;
		}
		//평균
		average = sum / (double)num.length ; // 실수 변경 double 사용
		
		//최대값 최소값
		int max = num[0] ; // num[0] 이라는 기준을 잡는다.
		int min = num[0] ; // num[0] 이라는 기준을 잡는다.

		for(int i=1; i<num.length; i++) { // i=1 하는 이유는 변수 max=num[0]으로 선언해서
			if(num[i] > max) 
				max = num[i] ;
			else if(num[i] < min) 
				min = num[i] ;
		
		}
		// 배열 출력
		for(int i=0; i<num.length; i++)
			System.out.printf("%d, ",num[i]);
		
		// 배열 총합 과 평균
		System.out.println();
		System.out.printf("총 합 = %d",sum);
		System.out.printf(" , 평균 = %.2f%n",average); // %.2f는 정서는 다 표현,.2는 소수점자리까지표현
//		System.out.println("평균 = "+ average);
		
		// 배열 최대값 최소값
		System.out.printf("최대값 = %d",max);
//		System.out.printf(" , 최소값 = %d",min);
		System.out.printf(" , 최소값 = "+min);
		
		System.out.println("\n------------------------------");
		
		
		
	}

}
