package ch2Labs;

import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle getrecd = new Rectangle(4,20,69,69);
		double area = getrecd.getWidth() * getrecd.getHeight();
		System.out.println("Area is " + area);
	}

}
