package ex1;

class TV {
	//Tv의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(On/Off)
	int channel; // 채널
	
	//디폴트 생성자
	TV(){
		System.out.println("디폴트생성자");
	}
	TV(String c, boolean p, int ch){
		color = c;
		power = p;
		channel = ch;
		System.out.println("3개 매개변수 생성자");
	}
	
	//Tv의 기능(메서드)
	void power(){ power = !power;} //TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp(){ ++channel;} // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown(){ --channel;} // TV의 채널을 낮추는 기능을 하는 메서드
	void show()	
		{System.out.println(color + "," + power + "," + channel);
	}
}

class TvTest {
	public static void main(String[] args) {
		TV t ; // Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new TV("파랑", true, 8); // Tv인스턴스를 생성
//		t.channel = 7 ; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
//		t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
//		System.out.println("현재 채널은" + t.channel + " 입니다.");
//		
		t.show() ;
	}
}