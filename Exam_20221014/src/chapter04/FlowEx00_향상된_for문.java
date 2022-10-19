package chapter04;

public class FlowEx00_향상된_for문 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int tmp : arr)
			System.out.println(tmp);
		
		//System.out.println(tmp);
	}

}
