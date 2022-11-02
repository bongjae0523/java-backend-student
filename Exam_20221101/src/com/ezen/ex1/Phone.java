package com.ezen.ex1;

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi~" + number);
	}
	
	public void playApp() {
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("App is~" + androidVer);
	}
}



public class Phone {

	public static void main(String[] args) {

		SmartPhone ph1 = new SmartPhone("010-555", "Nonull");
		MobilePhone ph2 = new SmartPhone("010-777", "65498156");
		
		ph1.answer();
		ph1.playApp();
		
		ph2.answer();
		ph2.playApp();
		
		
		
		
	}

}
