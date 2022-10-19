package Ex1;

public class TvEx1 {

	public static void main(String[] args) {

		Tv2 tv = new Tv2();
		
		tv.channel =23;
		
		System.out.println(tv.channel);
	}

}

class Tv2{
	String color; // 색상
	boolean power; // 전원상태(On/Off)
	int channel; // 채널
	
	void power() {
		power = !power ;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		 --channel;
	}
	
}