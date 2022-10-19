package chapter05;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		String[] names = {"Kim", "Park", "Kim"};
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[0]==names[2]);
		System.out.println();
		
		String[] names2 = new String[3];
		names2[0] = new String("Kim") ;
		names2[1] = new String("Park") ;
		names2[2] = new String("Kim") ;
		
		System.out.println(names2[0]);
		System.out.println(names2[1]);
		System.out.println(names2[2]);
		System.out.println(names2[0]==names2[2]);
		System.out.println(names[0].equals(names[2])); //문자열은 equals 를 사용
		
//		for(int i =0; i<names.length; i++)
//			System.out.println("names["+i+"]:"+names[i]);
		
	}

}
