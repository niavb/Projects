package projects19;

public class Person {
	private String name;
	private String phoneNumber;
	private String adress;
	private String email;
	
	public Person(String name, String phoneNumber, String adress, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Person's name: " + name + "; Adress: " + adress + "; Phone number: " + phoneNumber + "; E-mail: " + email;
	}

}
