package com.ezen.ex03;

public class SamsungTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("삼성티비 전원온");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성티비 전원오프");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성티비 볼륨업");
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성티비 볼륨다운");
		
	}

}
