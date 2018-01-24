package schoolcode;
import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int numToGuess;
		int guess;
		
		Scanner sc = new Scanner(System.in);
		Random gen = new Random();
		
		numToGuess = gen.nextInt(10) + 1;
		System.out.println("Guess a number between 1 and 10");
		guess = sc.nextInt();
		int count = 1;
		while (numToGuess != guess){
			count++;
			System.out.println("Nope.");
			guess = sc.nextInt();
			//numToGuess = gen.nextInt(10) + 1;
			
		}
		System.out.println("You did it! It took you " + count + ((count==1)? " try":" tries"));
		sc.close();

	}

}
