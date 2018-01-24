package ch3Labs;

public class Door {
	private String name;
	private String state;
	
	public Door(String name, String state) {
		this.name = name;
		this.state = state;
	}
	
	public void close() {
		setState("close");
	}
	public void open() {
		setState("open");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}