package schoolcode;
import java.util.Scanner;
import java.util.Random;
public class Jackpot {
	
//  Your Name Here
//  9/02/2015
//  Jackpot.java
//  Prompt the user to enter the number of
//  sides for the 3 dice to be rolled.  This
//  user input will be checked, and the user
//  will be reprompted if they make an error.
//  The 3 dice are then constructed using
//  the value entered by the user.  The dice
//  are then rolled until all 3 dice show the
//  same face value.  A count is also recorded
//  and shown as the 3 dice are rolled.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dice1, dice2, dice3;
		
		System.out.println("Enter a number greater than 0 please.");
		while(true){
			String input = sc.next();
			if(!isNumber(input))
				System.out.println("No.");
			else {
				dice1 = Integer.parseInt(input);
				break;
			}
		}
		while(true){
			String input = sc.next();
			if(!isNumber(input))
				System.out.println("No.");
			else {
				dice2 = Integer.parseInt(input);
				break;
				}
			}
		while(true){
			String input = sc.next();
			if(!isNumber(input))
				System.out.println("No.");
			else {
				dice3 = Integer.parseInt(input);
				break;
				}
			}
		
		Random rand = new Random();
		int timesRolled=0;
		while(true) {
			
			int roll1 = rand.nextInt(dice1)+1;
			int roll2 = rand.nextInt(dice2)+1;
			int roll3 = rand.nextInt(dice3)+1;
			System.out.println(timesRolled + ":\t" + roll1 + "\t" + roll2 + "\t" + roll3);
			timesRolled++;

			if(roll1 == roll2 && roll2 == roll3)
				break;
		}
		sc.close();
	}
	public static boolean isNumber(String string) {
		int temp;
	    try {
	        temp = Integer.parseInt(string);
	    } catch (Exception e) {
	        return false;
	    }
	    return temp>0;
	}

}