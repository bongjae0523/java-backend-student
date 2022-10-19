package chapter04;
/*
 * 구구단 for문에 break 해보기
 */
	import java.util.* ;
	
public class FlowEx30_1 {

	public static void main(String[] args) {

		for(int i=2; i<=9;i++) {
			for(int j=1; j<=9;j++)  {
				
				System.out.printf("%d * %d = %02d%n", i, j, i*j);

			if(i<=j)
				break ;
			}
			System.out.println("==================");
			
		}

	}
}

