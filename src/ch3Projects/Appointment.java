package ch3Projects;

public class Appointment {
	private TimeInterval time;
	
	public boolean conflictsWith(Appointment other) {
		return this.getTime().overlapsWith(other.getTime());
	}
	
	
	public TimeInterval getTime() {
		return time;
	}

	
	
	public void setTime(TimeInterval time) {
		this.time = time;
	}
}
