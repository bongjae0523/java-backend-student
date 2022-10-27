package com.ezen.ex03;

public class TVUser {

	public static void main(String[] args) {
	
		TV tv1 = new SamsungTV();
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		tv1 =  new LgTV();
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		
	
	}
}
