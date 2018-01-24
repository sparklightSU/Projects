package schoolcode;

import java.util.Scanner;
public class ScrambledEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bhenchod = sc.next();
		System.out.println(scrambleWord(bhenchod));
		sc.close();
	}
	public static String scrambleWord(String word) {
		String newString ="";
		if(word.length()>1) {
			for(int i=0;i<word.length()-1;i++) {
				if(word.substring(i, i+1).equals("A")){
					/*if(word.substring(i+1,i+2).equals("A")){
						newString+=word.substring(i,i+2);
						i++;
					}else{*/
						newString+=word.substring(i+1, i+2);
						newString+=word.substring(i,i+1);
						i++;
					}
					
				else newString+=word.substring(i,i+1);
			}
			newString+=word.substring(word.length()-1);
			
		}else newString=word;
		return newString;
	}

}
