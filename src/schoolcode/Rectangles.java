package schoolcode;


import java.awt.Rectangle;

public class Rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10, 20, 30, 30);
		Rectangle r2 = r1; // sets r2 the same object as r1
		
		System.out.println(r1.getWidth()+ " " + r1.getHeight());
		System.out.println(r2.getWidth()+ " " + r2.getHeight());
		
		r1.setSize(60,160);//.add(30,30)
		
		System.out.println(r1.getWidth()+ " " + r1.getHeight());
		System.out.println(r2.getWidth()+ " " + r2.getHeight());
	}

}
