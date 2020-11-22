package projects15;

public class Time_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time one = new Time();
		Time two = new Time(555550000);
		Time three = new Time(5, 23, 55);
		
		System.out.println("One: hours: " + one.getHours() + " min: " + one.getMin() + " sec: " + one.getSec());
		System.out.println("Two: hours: " + two.getHours() + " min: " + two.getMin() + " sec: " + two.getSec());
		System.out.println("Three: hours: " + three.getHours() + " min: " + three.getMin() + " sec: " + three.getSec());
	}

}
