package projects13;

public class Fan {
	public int SLOW = 1;
	public int MEDIUM = 2;
	public int FAST = 3;
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	public Fan() {
		speed = SLOW;
		switchedOn = false;
		radius = 5;
		color = "Blue";
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getSwitchedOn() {
		return switchedOn;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String fanData = "";
		if(switchedOn) {
			fanData += "Color:" + color + " Radius:" + String.valueOf(radius) + " Speed:" + String.valueOf(speed);
		}else {
			fanData += "Color:" + color + " Radius:" + String.valueOf(radius) + " The fan is turned off";
		}
		return fanData;
		
	}

}
