package chapter06;
/*
 * 매개변수(입력)x 반환(출력)x
 * 함수 --> 원형,정의,호출(c언에서 구분..)
 */
public class functionEx01 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램");
		func1(); //함수 호출.(메서드 호출) //func1() 괄호 안에 인자
		
		System.out.println("프로그램 종료...");
	}
	
	static void func1() { //func1() 괄호 안에 '매개변수'
	//    void(자리)는 반환타입을 결정, func1은 함수이름(변수 명명규칙과 동일)
	// void는 반환타입이 없다. 즉 return 하지 않는다.
		System.out.println("매개변수, 반환형 없는 함수테스트");
		
	}

}
