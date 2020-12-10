package projects19;

public class Student extends Person {
	private int status;
	public static final int FRESHMAN = 1;
	public static final int JUNIOR = 2;
	public static final int SOPHMORE = 3;
	public static final int SENIOR = 4;
	
	public Student(String name, 
			String phoneNumber, 
			String adress, 
			String email, 
			int status) {
		super(name, phoneNumber, adress, email);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		return super.toString() + "\nStudent's status: " + status;
	}

}
