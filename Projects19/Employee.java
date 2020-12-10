package projects19;

import java.util.Date;

public class Employee extends Person{
	private String office;
	private double salary;
	private Date dateHired = new Date();
	
	public Employee(String name, 
			String phoneNumber, 
			String adress, 
			String email, 
			String office, 
			double salary) {
		super(name, phoneNumber, adress, email);
		this.office = office;
		this.salary = salary;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "\nEmployee's office: " + office + "; Salary: " + salary + "; Date hired: " + dateHired.toString();
	}
	

}
