package Ex1;

public class TvEx0 {

	public static void main(String[] args) {

		Tv[] tvArr = new Tv[3];
		
		tvArr[0] = new Tv();
		tvArr[0].channel =7;
		
		tvArr[1] = new Tv();
		tvArr[1].channel =11;

		tvArr[2] = new Tv();
		tvArr[2].channel =23;
		
		System.out.println(tvArr[0].channel);
	}

}

class Tv{
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