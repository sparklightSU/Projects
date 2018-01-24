package ch7Code;

import java.util.Random;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstNames = {"Andy ", "Barbara ", "Chandra ", "Dyson ", "Eric "};
		String[] middleInitials = {"F. ", "G. ", "H. ", "I. "};
		String[] lastNames = {"Jackman", "Kincaid", "Lacy"};
		firstNames[2] = "Charlize";
		dumpArray("String[] firstNames (with Charlize)", firstNames);
		firstNames[1] = "Betty";
		dumpArray("String[] firstNames (with Betty)", firstNames);
		firstNames[firstNames.length-1] = "Zachary";
		dumpArray("String[] firstNames (with Zachary)", firstNames);
		
		String temp = firstNames[0];
		firstNames[0] = firstNames[2];
		firstNames[2] = temp;
		dumpArray("String[] firstNames(after swapping)", firstNames);
		
		for(int i = 0; i < middleInitials.length - 1; i+=2) {
			//if i+=1, does FGHI > GFHI > GHFI > GHIF
			String temp1 = middleInitials[i];
			middleInitials[i] = middleInitials[i+1];
			middleInitials[i+1] = temp1;
		}
		dumpArray("String[] middleInitials", middleInitials);
		
		String[] randomNames = new String[10];
		Random rngesus = new Random();
		for(int i = 0; i < randomNames.length; i++) {
			String temp2 = firstNames[rngesus.nextInt(firstNames.length)] + 
					middleInitials[rngesus.nextInt(middleInitials.length)] + 
					lastNames[rngesus.nextInt(lastNames.length)];
		}
		while(indexOfDuplicate(randomNames) < 0)
			randomNames[indexOfDuplicate(randomNames)] = firstNames[rngesus.nextInt(firstNames.length)] + 
					middleInitials[rngesus.nextInt(middleInitials.length)] + 
					lastNames[rngesus.nextInt(lastNames.length)];
		
		dumpArray("String[] randomNames",randomNames);
	}
	public static int indexOfDuplicate(String[] arr) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if (arr[j].equals(arr[i]))
					return j;
			}
		}
		return -1;
	}
	public static void dumpArray(String title, String[] arr) {
		System.out.println(title);
		for(int i = 0; i < arr.length; i++)
			System.out.println("[" + i + "]=" + arr[i]);
	}

}
