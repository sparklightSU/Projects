package ch3Labs;

/**
A class to test the Door class.
*/
public class DoorTester
	{
/**
   Tests the methods of the Door class
   @param args not used
*/
	public static void main(String[] args)
	{
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected:  open");
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  closed");        
		// Use the mutator to change the state variable
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  open");
		// Add code to test the setName mutator here 
		frontDoor.setName("Top");
		System.out.println("The name of frontDoor is: " + frontDoor.getName());
		System.out.println("Expected: Top");
		
		Door sideDoor = new Door("Side", "closed");
		sideDoor.setState("open");
		System.out.println(sideDoor.getState());
   
	}
}
