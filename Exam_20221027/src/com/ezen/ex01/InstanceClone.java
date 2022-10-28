package com.ezen.ex01;
//                    Markerinterface
class Point implements Cloneable{
	int xPos;
	int yPos;
	
	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d,%d]\n", xPos , yPos);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class InstanceClone {

	public static void main(String[] args) {

		Point org = new Point(3,5);
		Point cpy = null ;
		
//		cpy = org;
//		org.showPosition();
//		cpy.showPosition();
		
		try {
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		org.xPos = 20;
		org.yPos = 50;
		
		org.showPosition();
		cpy.showPosition();
		
		System.out.println(org);
		System.out.println(cpy);
		
		
		
	}

}
