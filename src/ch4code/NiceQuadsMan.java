//1
package ch4code;

public class NiceQuadsMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 4, c = 15;
		int det = b * b - 4 * a * c;
		
		System.out.println("b=" + b);
		System.out.println("b^2-4ac=" + det);
		try {
			if(det<0)
				throw new ArithmeticException();
			System.out.println(Math.sqrt(det));
			System.out.println("First root: " + (-b + Math.sqrt(det)) / (2*a) );
			System.out.println("Second root: " + (-b - Math.sqrt(det)) / (2*a) );

		}
		catch(Exception e) {
			System.out.println("b^2-4ac is less than zero you dummy");
		}
	}

}
