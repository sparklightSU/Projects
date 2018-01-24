package schoolcode;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int COVERAGE = 350;
		int l,w,h;
		double totalSqFt;
		double paintNeeded;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length, width, and height of the room.");
		l = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		totalSqFt=2*w*h+l*w;
		paintNeeded = totalSqFt / COVERAGE;
		
		System.out.println("A room with length, width, and height of " + l + ", " + w + ", and " + h + ", you need " + paintNeeded + " gallons of paint.");
		sc.close();
	}

}