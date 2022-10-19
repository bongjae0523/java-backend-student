package chapter05;


public class ArrayEx08 {

	public static void main(String[] args) {
		
		int[] ball = new int[45] ;
		
		for(int i=0; i<ball.length; i++)
			ball[i] =i+1 ;
		
//		for(int i=0; i<6; i++)
//			System.out.printf("ball[%d]= %d%n",i,ball[i]);
//		System.out.println();
		
		int tmp = 0 ;
		int j = 0 ;
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45); //0 ~ 44 정수 
			System.out.print(j+",");
			tmp = ball[i] ; 
			ball[i] = ball[j] ;  
			ball[j] = tmp ; // ball[i] 와 ball[j] 위치바꿈
			// ex) i=0, j=30 일 때 ball[0]과 ball[30] 위치 변경 -> 31 2 3 ... 1 32 33...45
			
//			System.out.print(i);
//			System.out.println("= "+j);
		}
		
		System.out.println();
		for(int i=0; i<45; i++)
			System.out.printf("ball[%d]= %d%n",i,ball[i]);
		
	}

}
