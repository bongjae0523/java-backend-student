package method.test;
/*
 * 임의의 정수를 배열로 생성해서
 * 입력하고 정렬하는 프로그램 작성
 */
public class Test3 {

	public static void main(String[] args) {

		int[] num = new int[5];
		int i = 0;
		int j = 0;
		
		//배열생성
		for(i=0; i<num.length;i++) {
			num[i] = (int)(Math.random()*100);
			for(j=0;j<i;j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		System.out.println("배열 생성");
		for (i = 0; i < num.length; i++) {
			 System.out.print(num[i]+",");
	     }
		System.out.println();
		//오름차순
		for(i=0; i<num.length-1;i++) {
			for(j=0; j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int tmp;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		System.out.println("오름차순");
		for (i = 0; i < num.length; i++) {
			 System.out.print(num[i]+",");
	    }
		System.out.println();
		//내림차순
		for(i=0; i<num.length-1;i++) {
			for(j=0; j<num.length-1-i;j++) {
				if(num[j]<num[j+1]) {
					int tmp;
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		System.out.println("내림차순");
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i]+",");
		}
		
		
		
		
				
	}

}