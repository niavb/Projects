package projects19;

public class Staff extends Employee{
	private String title;
	
	public Staff(String name, 
			String phoneNumber, 
			String adress, 
			String email, 
			String office, 
			double salary, 
			String title) {
		super(name, phoneNumber, adress, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\nStaff's title: " + title;
	}

}
