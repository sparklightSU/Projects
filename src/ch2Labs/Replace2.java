package ch2Labs;

public class Replace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(appendString("According to all known laws of aviation, there is no way a bee should be able to fly.","bee", "fite me irl"));
	}
	public static String appendString(String str1, String str2, String str3){
		return str1.replace(str2, str3);
	}

}
