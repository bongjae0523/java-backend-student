package chapter04;
/*
 * 
 */
	import java.util.* ;
	
public class FlowEx30_2 {

	public static void main(String[] args) {

		for(int i=2; i<=9;i++) {
			for(int j=1; j<=9;j++)  {
				

			if(i==j)
				continue ; // 아래 식이 아닌 위로 다시 식을 보냄
			System.out.printf("%d * %d = %02d%n", i, j, i*j);
			}
			System.out.println("==================");
			
		}

	}
}

