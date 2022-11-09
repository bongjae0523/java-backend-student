package com.ezen.ex1;

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
 * 
 * --> 추가
 * 상속을 통해서.. TeamClass 생성..
 * 과목을 2개 추가 과학,컴퓨터..
 * TeamClass를 통해서 옆조 5을 기입.. 초기화는 생성자를 통해서 한다.
 */
public class ExamTest {

	public static void main(String[] args) {

		List<Student> st = new ArrayList<>();
		
		st.add(new Student("신봉재",100,100,100));
		st.add(new Student("신봉재",99,99,99));
		st.add(new Student("신봉재",98,98,98));
		st.add(new Student("신봉재",97,97,97));
		
		Iterator<Student> it =st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------");
		
		List<TeamClass> tc = new ArrayList<>();
		
		tc.add(new TeamClass("신봉재",96,96,96,96,96));
		tc.add(new TeamClass("신봉재",95,95,95,95,95));
		tc.add(new TeamClass("신봉재",94,94,94,94,94));
		tc.add(new TeamClass("신봉재",93,93,93,93,93));
		
		Iterator<TeamClass> it2 =tc.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}


class Student{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public int sum() {
		return kor+eng+math;
	}
	
	public double avg() {
		return (kor+eng+math)/3.0d;
	}
	
	public String getName() { // private 변수를 사용하기 위해 메서드 생성 후 다른 클래스에서 사용하기.
		return name;
	}
	
	Student(){
		this(null,0,0,0);
	}
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		return name + "은/는 " + " 합계: " + sum() + " 평균: " + avg();
	}
}

class TeamClass extends Student{
	
	private int sci;
	private int com;
	
	TeamClass(){
		this("null",0,0,0,0,0);
	}
	
	TeamClass(String name, int kor, int eng, int math,int sci, int com){
		super(name,kor,eng,math);
		this.sci = sci;
		this.com = com;
	}
	
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return super.sum()+sci+com;
	}
	
	@Override
	public double avg() {
		return (super.avg()+sci+com)/3.0d;
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}

