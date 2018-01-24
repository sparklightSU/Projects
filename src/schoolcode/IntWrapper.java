package schoolcode;

import java.util.Scanner;

public class IntWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer please.");
		Integer thing = new Integer(sc.nextInt());
		System.out.println("Binary form: " + Integer.toBinaryString(thing));
		System.out.println("Octal form: " + Integer.toOctalString(thing));
		System.out.println("Hexadecimal form: " + Integer.toHexString(thing));
		
		final Integer big = new Integer(Integer.MAX_VALUE);
		final Integer small = new Integer(Integer.MIN_VALUE);
		System.out.println("Highest value: " + big);
		System.out.println("Lowest value: " + small);
		
		System.out.println("Enter two integers: ");
		Integer n1 = new Integer(Integer.parseInt( (sc.next() ) ) );
		Integer n2 = new Integer(Integer.parseInt( (sc.next() ) ) );
		System.out.println("Sum: " + Integer.sum(n1, n2));
		sc.close();
	}

}
