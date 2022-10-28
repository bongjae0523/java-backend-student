package com.ezen.ex05;

//다음 클래스 정의에서 PersonalInfo의 clone 메소드 호출 시 
//깊은 복사가 이뤄지도록 clone메소드를 오버라이딩 하시오..
class Business implements Cloneable{
	 String company;
	 String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo() {
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class PersonalInfo implements Cloneable{
	 String name;
	 int age;
	 Business bz;
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bz = (Business)bz.clone();
		return copy;
	}
}

public class TestEx00 {
	public static void main(String[] args) {
		PersonalInfo org = new PersonalInfo("김윤아",31, "ezen", "학생");
		PersonalInfo cpy;
		
		try {
			cpy = (PersonalInfo)org.clone();
			org.showPersonalInfo();
			cpy.showPersonalInfo();
			System.out.println("---------------------");
			org.name = "김뭐시기";
			org.age = 300;
			org.bz.company = "수원";
			org.showPersonalInfo();
			cpy.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
}
