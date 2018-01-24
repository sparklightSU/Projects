package ch3Code;

public class DiceDriver {

	public static void main(String[] args) {
		Dice dice = new Dice();
		
		for(int i=0;i<20;i++) {
		dice.roll();
		System.out.println(dice.getValue());
		}
	}
	

}
