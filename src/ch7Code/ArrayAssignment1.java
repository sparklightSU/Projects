package ch7Code;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstNames = {"Andy ", "Barbara ", "Chandra ", "Dyson ", "Eric "};
		String[] middleInitials = {"F. ", "G. ", "H. ", "I. "};
		String[] lastNames = {"Jackman", "Kincaid", "Lacy"};
		String[] names = new String[10];
		int totalCombinations = firstNames.length * middleInitials.length * lastNames.length;
		String[] allNames = new String[totalCombinations];
		int allNameIndex = 0;
		names[0] = firstNames[0] + middleInitials[0]+lastNames[0];
		names[1] = firstNames[1] + middleInitials[1]+lastNames[0];
		names[2] = firstNames[1] + middleInitials[1]+lastNames[1];
		names[3] = firstNames[0] + middleInitials[1]+lastNames[1];
		names[4] = firstNames[1] + middleInitials[0]+lastNames[1];
		names[5] = firstNames[3] + middleInitials[2]+lastNames[2];
		names[6] = firstNames[4] + middleInitials[2]+lastNames[0];
		names[7] = firstNames[2] + middleInitials[2]+lastNames[2];
		names[8] = firstNames[3] + middleInitials[1]+lastNames[1];
		names[9] = firstNames[3] + middleInitials[3]+lastNames[0];
		for(int i = 0; i < names.length; i++) System.out.println(names[i]);
		System.out.println("\n\n\n\n\n\n");
		
		for(int i = 0; i < firstNames.length; i++) {
			for(int j = 0; j < middleInitials.length; j++) {
				for(int k = 0; k < lastNames.length; k++) {
					allNames[allNameIndex++] = firstNames[i] + middleInitials[j] + lastNames[k];
				}
			}
		}
		
		for(int i = 0; i < allNames.length; i++)
			System.out.println(allNames[i]);
	}

}
