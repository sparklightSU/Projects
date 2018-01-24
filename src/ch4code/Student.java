//4
package ch4code;

public class Student {
	private String lastName;
	private String firstName;
	
	private int yearsStuckOnIsland;
	private int goals;
	private String goal;
	
	private int age;
	private boolean isFelon;
	
	public Student() {
		lastName = "Queen";
		firstName = "Oliver";
		yearsStuckOnIsland = 5;
		goals = 1;
		goal = "to save my city";
	}
	public Student(String lastName, String firstName, int age, boolean isFelon) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.isFelon = isFelon;
	}
	public String toString() {
		if(lastName.equals("Queen") && firstName.equals("Oliver"))
			return("My name is " + firstName + " " + lastName + ". " + 
			"After " + yearsStuckOnIsland + " years in hell, I returned home with " + 
			((goals==1)?"only one goal":(goals + "goals")) + ": " + goal + ".");
		else return "My name is " + firstName + " " + lastName + 
				". I am currently " + age + " years old and I am " + (isFelon?"a felon":"not a felon") + ".";
	}
}