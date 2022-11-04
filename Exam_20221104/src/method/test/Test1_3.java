package method.test;
/*
 * 2단에서 9단까지 구구단을 출력하는 메소드 작성
 */
public class Test1_3 {

	public static void main(String[] args) {

		for (int i = 2; i <=9 ; i++ ){
			gugudan(i);
		}
	}
	
	public static void gugudan(int n){

		System.out.println(n + "단");

		for (int i = 1; i <=9 ; i++ ){
			System.out.println(n + "*" + i + "=" + (n*i));
		}
		System.out.println();
	}

}
