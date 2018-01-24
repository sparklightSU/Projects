package schoolcode;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		int radius1=10;
		double area1 = PI * radius1 * radius1;
		double circ1 = 2 * PI * radius1;
		
		System.out.println("The area of a circle with radius " + radius1 + " is " + area1);
		System.out.println("The circumference of a circle with radius " + radius1 + " is " + circ1);

		
		int radius2 = 20;
		double area2 = PI * radius2 * radius2;
		double circ2 = 2 * PI * radius2;
		
		System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
		System.out.println("The circumference of a circle with radius " + radius2 + " is " + circ2);
		//Doubling radius quadruples area.
		System.out.println("The circle with a radius of " + radius1 + " is " + (area2/area1) + " times smaller than the circle with the radius of " + radius2);



	}

}
