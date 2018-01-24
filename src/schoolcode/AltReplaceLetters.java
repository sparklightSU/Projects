package schoolcode;


public class AltReplaceLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "The quick brown fox jumps over the lazy dog.";
		String vowels = "aeiou";
		for(int letterIndex=0;letterIndex<name.length();letterIndex++){
			String letter = name.substring(letterIndex, letterIndex+1);
			if(vowels.indexOf(letter)>0)
				letter = "*";
			System.out.print(letter);
				
			
		}
	}

}
