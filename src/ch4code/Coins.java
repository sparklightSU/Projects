//2
package ch4code;

import java.util.Scanner;

public class Coins {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of cents (from 1 to 1000): ");
		int coinVal = sc.nextInt();
		sc.close();
		int count = 0;
		
		for(int q = 0; q <= coinVal/25; q++) {
			for(int d = 0; d <= coinVal/10; d++) {
				for(int n = 0; n <= coinVal/5; n++) {
					for(int p = 0; p <= coinVal; p++) {
						int tester = q * 25 + d * 10 + n*5 + p;
						if(tester == coinVal) {
							System.out.println(coinVal + " = " + q + " quarters + " + d + " dimes + " + n + " nickels + " + p + " pennies");
							count++;
						}
					}
				}
			}
				
		}
		System.out.println("A total of " + count + " combinations for " + coinVal + " cents");
	}

}