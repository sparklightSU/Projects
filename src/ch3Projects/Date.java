package ch3Projects;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int date, int year) {
		this.month = month;
		this.day = date;
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDate(int date) {
		this.day = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
