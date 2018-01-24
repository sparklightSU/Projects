package ch3Projects;

public class Seats {

	private String colorOfSeats;
	private int numberOfSeats;
	
	public Seats(String colorOfSeats, int numberOfSeats) {
		this.colorOfSeats = colorOfSeats;
		this.numberOfSeats = numberOfSeats;
	}
	
	public boolean sameColor(Seats a) {
		return this.getColorOfSeats().equals(a.getColorOfSeats());
	}
	
	public String getColorOfSeats() {
		return colorOfSeats;
	}
	public void setColorOfSeats(String colorOfSeats) {
		this.colorOfSeats = colorOfSeats;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
