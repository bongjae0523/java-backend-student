package chapter04;

	import java.util.* ;
	
public class FlowEx28_1 {

	public static void main(String[] args) {

		int sum, i ;
		sum = 0 ;
		i = 1 ;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("sum= " + sum);
	}

}
