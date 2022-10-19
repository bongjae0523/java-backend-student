package Ex1;

public class Exercise6 {

	public static void main(String[] args) {

	Student s = new Student();
	s.name = "홍길동";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 76;
	s.math = 60;
	
	System.out.println("이름 = "+ s.name);
	System.out.println("총점 = "+ s.getTotal());
	System.out.println("평균 = "+ s.getAverage());
	
	System.out.println("-----------------------------");
	
	Student 백수민 = new Student("백수민", 2, 2, 100, 90, 95)  ;
	System.out.println(백수민.info());
	}

}

class Student{
	String name ;
	int ban ;
	int no ;
	int kor ;
	int eng ;
	int math ;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f*10+0.5f) / 10f ;
	}	
	
	Student(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info(){
		return name +"," + ban + "," + no+ "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()  ;
	}
	
	
}