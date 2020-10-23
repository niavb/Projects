package projects10;

public class Circle {
	public double radius;
	
	public Circle(){
		radius = 1;
	}
	
	public Circle(double newRadius){
		radius = newRadius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double newRadius){
		radius = newRadius;
	}

}
