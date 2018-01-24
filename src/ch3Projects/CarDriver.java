package ch3Projects;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Green", 10);
		Car car2 = new Car("Blue",4);
		
		System.out.println(car1.getSeats().getColorOfSeats()
				.equals(car2.getSeats().getColorOfSeats()));
	}

}
