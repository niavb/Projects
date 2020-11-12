package projects12;

public class Student {
	
	private String name;
	private double uspeh;
	
	public Student(){	
	}
	
	public Student(String name, double uspeh){
		this.setName(name);
		this.setUspeh(uspeh);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUspeh() {
		return uspeh;
	}

	public void setUspeh(double uspeh) {
		this.uspeh = uspeh;
	}
}
