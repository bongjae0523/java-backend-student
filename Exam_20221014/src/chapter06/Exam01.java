package chapter06;
/*
 * 6장 객체와 인스턴스
 * class Sung라는 점수표를 작성
 * main 메서드에 Sung라는 class 사용하여 불러오기
 * Sung class 안에 있는 총점, 평균 함수 불러오기
 * 
 * 1. class 설계
 * 2. 객체 생성
 * 3. 생성된 객체 통해서 클래스 접근(메서드)
 */
public class Exam01 {

	public static void main(String[] args) {
		
		Sung 백수민 = new Sung("백수민", 96, 95, 99);
		백수민.총점();
		백수민.평균();
		백수민.show();
		
		Sung 황규성 = new Sung("황규성", 50, 45, 60);
		황규성.총점();
		황규성.평균();
		황규성.show();
		
		Sung 이상호 = new Sung("이상호", 10, 20, 45);
		이상호.총점();
		이상호.평균();
		이상호.show();
		
		Sung 임채리 = new Sung("임채리", 11, 22, 33);
		임채리.총점();
		임채리.평균();
		임채리.show();
		
	}
	
}

// class Sung를 생성
class Sung{
	String name ;
	int kor ;
	int eng ;
	int math ;
	int total ;
	double avg ;
	
	//생성자
	Sung(String n, int k, int e, int m){ //class의 첫글자는 대문자
		name = n ;
		kor = k ;
		eng = e ;
		math = m ;
	}
	
	void 총점() {
		total = kor+eng+math ;
	}
	
	void 평균() {
		avg = total / 3.0 ;
	}
	
	void show() {
		System.out.print("name: "+ name);
		System.out.print(" kor: "+ kor);
		System.out.print(" eng: "+ eng);
		System.out.print(" math: "+ math);
		System.out.print(" total: "+ total);
		System.out.printf(" avg: %.1f ", avg);
		System.out.println();
	}
}

