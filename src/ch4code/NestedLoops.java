package ch4code;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		//B
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println();
		//C
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		//D
		System.out.println();
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++)
				System.out.print(j*(6-i));
			System.out.println();
		}
		//E
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(">");
			System.out.print("*");
			for(int j = 1; j <= i; j++)
				System.out.print("<");
			System.out.println();
		}
		//F
		System.out.println();
		int rows = 1;
		Scanner sc = new Scanner(System.in);
		while (rows > 0) {
			System.out.println("Enter the length of a side(or a negative number to exit): ");
			rows = sc.nextInt();
			for(int i = 1; i <= rows; i++){
				for(int j = 1; j <= rows; j++){
					if(i > 1 && i < rows && j > 1 && j < rows)
		                System.out.print(" ");
					else
		                System.out.print("*");
					}
		    System.out.println();
			}
		}
		sc.close();
	}

}
