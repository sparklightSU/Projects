package ch3Projects;

public class Employee {
	private int employeeID;
	private Date dateOfHire;
	private Address address;
	
	public Employee(int employeeID, Date dateOfHire, Address address) {
		this.employeeID = employeeID;
		this.dateOfHire = dateOfHire;
		this.address = address;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Date getDateOfHire() {
		return dateOfHire;
	}
	public void setdateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public boolean conflictsWith(Date dateOfHire2) {
		return (this.getDateOfHire().getMonth() == dateOfHire2.getMonth() &&
				this.getDateOfHire().getDay() == dateOfHire2.getDay() &&
				this.getDateOfHire().getYear() == dateOfHire2.getYear());
		
	}
	
	
}
