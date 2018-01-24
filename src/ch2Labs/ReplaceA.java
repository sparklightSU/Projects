package ch2Labs;

public class ReplaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(appendString("According to All known Laws of Aviation", "There is no way a bee should be able to fly"));
	}
	public static String appendString(String str1, String str2){
		return str1.toUpperCase().replace("A", str2.toUpperCase());
		
	}

}
