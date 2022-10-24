package com.ezen.ex1;

public class CircleEx0 {
	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.r = 5;
		c.p.x = 10;
		c.p.y = 20;
		
	}
	
}


class Point{
	int x;
	int y;

}

class Circle{
	int r;
	Point p = new Point();
	
}


