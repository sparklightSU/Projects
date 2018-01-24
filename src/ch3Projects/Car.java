package ch3Projects;

public class Car {
	private Seats seats;
	public Car() {
		seats = null;
	}
	public Car(String colorOfSeats, int numberOfSeats) {
		seats.setColorOfSeats(colorOfSeats);
		seats.setNumberOfSeats(numberOfSeats);
	}

	public Seats getSeats() {
		return seats;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}
	
}
