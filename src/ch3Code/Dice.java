package ch3Code;

import java.util.Random;

public class Dice {
	private int numSides;
	private int rollCount;
	private int value;
	
	public Dice() {
		numSides = 6;
		rollCount = 0;
		value = -1;
	}
	
	public Dice(int n) {
		numSides = n;
		rollCount = 0;
		value = -1;
	}
	public void roll () {
		Random rngesus = new Random();
		value = rngesus.nextInt(numSides) + 1;
		rollCount++;
	}
	
	public int getRollCount() {
		return rollCount;
	}
	public int getValue() {
		return value;
	}
	
}
