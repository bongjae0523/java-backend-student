package com.ezen.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * class 설계
 * 1.멤버변수 : 이름,국어,영어,수학<private>
 * 2.메서드: 총합, 평균<public>
 * 3.생성자
 * 
 * class 설계 후
 * 조원들을 클래스 ArrayList 배열을 통해서 데이터입력...(생성자 통해서 입력)
 * 
 * iterator 통해서 출력
 * 총합,평균 출력
 */
public class ExamTest {

	public static void main(String[] args) {

		List<Student> st = new ArrayList<>();

		st.add(new Student("신봉재",100,100,100));
		st.add(new Student("백수민",100,100,100));
		st.add(new Student("윤수경",100,100,100));
		st.add(new Student("채수림",100,100,100));
		
		Iterator<Student> it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


class Student{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		this(null,0,0,0);
	}
	
	public Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int sum() {
		return kor + eng + math;
	}

	public double avg() {
		return (kor + eng + math)/3.0;
	}
	
	@Override
	public String toString() {

		return name + " 국어 " + kor + " 영어 " + eng + " 수학 " + math + 
				" 합계 = " + sum() + " 평균 = " + avg();
	}
	
}