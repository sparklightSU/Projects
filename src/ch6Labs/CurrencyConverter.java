package ch6Labs;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tempInput = "boneless pizza";
		double usMoney = 0;
		while(!tempInput.equals("q")) {
			try {
				tempInput = sc.next();
				usMoney = Integer.parseInt(tempInput);
				System.out.println(usMoney * 0.85);
			}
			catch(Exception e) {
				if(!tempInput.equals("q"))
					System.out.println(tempInput + " isn't a number ya dingus");
			}
		}
	}

}
