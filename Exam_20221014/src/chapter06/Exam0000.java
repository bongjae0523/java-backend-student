package chapter06;

class ClassInFo{
	
	String name ; //이름
	String address ; // 주소
	String transport ; // 교통편
	int time ; //소요시간
	
	void setname(String n) {
		name = n ;
	}
	void setAddress(String a) {
		address = a ;
	}
	void setTransport(String p) {
		transport = p ;
	}
	void setTime(int t) {
		time = t ;	
	}
	
	void show() {
		System.out.println("이름: "+ name);
		System.out.println("주소: "+ address);
		System.out.println("주소: "+ transport);
		System.out.println("시간: "+ time + "분");
		System.out.println();
	}
}


public class Exam0000 {
	public static void main(String[] args) {
		
		ClassInFo 신봉재 = new ClassInFo();
		신봉재.setname("신봉재");
		신봉재.setAddress("경기도");
		신봉재.setTransport("대중교통");
		신봉재.setTime(30);
		신봉재.show();
		
		ClassInFo 김대철 = new ClassInFo();
		김대철.setname("김대철");
		김대철.setAddress("경기도");
		김대철.setTransport("자차");
		김대철.setTime(50);
		김대철.show();
		}
}
