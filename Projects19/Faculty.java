package projects19;

public class Faculty extends Employee{
	private double officeHours;
	private String rank;
	
	public Faculty(String name, 
			String phoneNumber, 
			String adress, 
			String email, 
			String office, 
			double salary,  
			double officeHours, 
			String rank) {
		super(name, phoneNumber, adress, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public double getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + "\nFaculty's office hours: " + officeHours + "; Rank: " + rank;
	}

}
