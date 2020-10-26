package projects12;

public class Student {
	
	private String name;
	private double uspeh;
	
	public Student(){	
	}
	
	public String getName() {
		return name;
	}
	
	public double getUspeh() {
		return uspeh;
	}
	
	public void StudentData(String name1, double uspeh1){
		name = name1;
		uspeh = uspeh1;	
	}
}
