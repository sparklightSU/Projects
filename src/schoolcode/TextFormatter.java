package schoolcode;

public class TextFormatter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFormatter test= new TextFormatter("aabaccb");
		System.out.println(test.findString("a",0));
		System.out.println(test.findString("b",4));
		System.out.println(test.findString("c",0));
		System.out.println(test.countStrings("a"));
		System.out.println(test.countStrings("b"));
		System.out.println(test.countStrings("c"));
	}
	
	private String line;
	public TextFormatter(String lineToFormat) {
		line = lineToFormat;
	}
	
	private int findString(String str, int start) {
		int letterPos = line.indexOf(str, start);
		while (letterPos >= 0) {
			String back = "";
			String front = "";
			if (letterPos > 0)
				back = line.substring(letterPos - 1, letterPos); 
			if (letterPos < line.length() - 1)
				front = line.substring(letterPos + 1, letterPos + 2);
			if (!back.equals(str) && !front.equals(str))
				return letterPos;
			letterPos = line.indexOf (str, letterPos + 1);
		}
		 return -1;
		
	}
	private int countStrings(String str) {
		int count = 0;
		for(int i = 0; i < line.length(); i++) {
			if (line.substring(i,i+1).equals(str))
				count++;
		}
		return count;
		
	}
	

}
