package ch1Labs;

public class Ch1Labs {

	public static void main(String[] args) {
		//Lab 1.1
		String test = "This is a Test";
		String lowerTest = test.toLowerCase();
		System.out.println(lowerTest);
		
		//Lab 1.2
		String bigTestString = lowerTest.toUpperCase();
		System.out.println(bigTestString);
		//original string not printed back, all upper case this time
		//prints out "THIS IS A TEST"
		
		//Lab 2.1
		/* concat adds things
		 * It works by:
		 * String a = "a";
		 * String b = "b";
		 * String concat = a.concat(b);
		 * concat basically adds b to the end of a
		 * The value of concat becomes b 
		 */
		
		//Lab 2.2
		String animal1 = "quick brown fox";
	    String animal2 = "lazy dog";
	    String article = "the";
	    String action = "jumps over";
	    String space =" ";

	      /* Your work goes here */

	      System.out.println(article.concat(space).concat(animal1).concat(space).concat(action).concat(space).concat(article).concat(space).concat(animal2));


	}

}
