package ch2Labs;

public class HollePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String holla = "Hello, world";
		String newString = "";
		for(int i=0;i<holla.length();i++){
			if(holla.substring(i, i+1).equals("e"))
				newString += holla.substring(i, i+1).replace("e","o");
			else if(holla.substring(i, i+1).equals("o"))
				newString += holla.substring(i, i+1).replace("o","e");
			else newString += holla.substring(i,i+1);
		}
		System.out.println(newString);
	}

}