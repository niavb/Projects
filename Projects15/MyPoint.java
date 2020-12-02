package projects15;

public class MyPoint {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public MyPoint() {
		setX(0);
		setY(0);
	}
	
	public MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public double Distance(MyPoint point) {
		return Math.sqrt(Math.pow((getX() - point.getX()), 2) + Math.pow((getY() - point.getY()), 2));
	}
	
	public double Distance(double x, double y) {
		return Math.sqrt( Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2) );
	}
	
	public static double Distance(MyPoint point1, MyPoint point2) {
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2)+Math.pow((point1.getY() - point2.getY()), 2));
	}

}
