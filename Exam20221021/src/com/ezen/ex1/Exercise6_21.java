package com.ezen.ex1;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int max_VOLUME = 100;
	final int min_VOLUME = 0;
	final int max_CHANNEL = 100;
	final int min_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < max_VOLUME)
			volume++ ;
	}
	
	void volumeDown() {
		if(volume > min_VOLUME)
			volume-- ;
	}
	
	void channelUp() {
		if(channel == max_CHANNEL)
			channel = min_CHANNEL;
		channel++;
	}
	
	void channelDown() {
		if(channel == min_CHANNEL)
			channel = max_CHANNEL;
		channel--;
	}
} //class MyTv


public class Exercise6_21 {

	public static void main(String[] arg	) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH = " + t.channel + ", VOL = " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH = " + t.channel + ", VOL = " + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH = " + t.channel + ", VOL = " + t.volume);
		
		
		
	}

}
