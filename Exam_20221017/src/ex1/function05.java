package ex1;

public class function05 {

	public static void main(String[] args) {
		
		Ideal 신봉재 = new Ideal(170.8, 88.4, "나아간다", "학생");
		신봉재.set이름("신봉재");
		신봉재.set재산(100);
//		신봉재.money();
		신봉재.show();
		
		
	}
}

class Ideal{
	
	long 재산;
	double 키;
	double 몸무게;
	String 이름;
	String 가치관;
	String 직업;
	
	// 생성자 
	Ideal(double h, double w, String n, String j){
		키=h;
		몸무게=w;
		가치관=n;
		직업=j;
	}
	
	void set이름(String n) {
		이름 = n ;
	}
	
	void set재산(long n) {
		재산 = n ;
	}
	
	void song() {
		System.out.println(이름 + "노래를 잘한다.");
	}
	
	void sports() {
		System.out.println(이름 + "운동을 잘한다.");
	}
	
	void money() {
		System.out.println(이름 + "은(는) " + 재산 + "원을 보유중.");
	}
	
	void show() {
		System.out.println(이름 + "," + 키 + "cm," + 몸무게 + "kg," + 가치관 + "," + 직업 + "," + 재산 + "원");
	}
}


