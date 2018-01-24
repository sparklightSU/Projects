package schoolcode;

public class StringMixer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mixString("Hello merry ewemes","e"));
	}
	public static String mixString(String myStr, String ch) {
		String newString = "";
		for(int i=0;i<myStr.length();i++) {
			if (myStr.substring(i,i+1).equals(ch)){
				newString += myStr.substring(i+1, i+2)+"C";
				i++;
			}
			else newString += myStr.substring(i,i+1);
		}
		return newString;
	}

}
