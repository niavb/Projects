package projects13;

public class RegularPolygon {
	
	private int n; //áðîÿ íà ñòðàíèòå
	private double sideLength; //äúëæèíàòà íà ñòðàíèòå
	private double x; //x-êîîðäèíàòàòà íà öåíòúðà
	private double y; //ó-êîîðäèíàòàòà íà öåíòúðà
	
	public RegularPolygon() {
		n = 3;
		sideLength = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double sideLength){
		this.n = n;
		this.sideLength = sideLength;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double sideLength, double x, double y){
		this.n = n;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}
	
	//getters
	public int getN() {
		return n;
	}
	public double getSideLength() {
		return sideLength;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//setters
	public void setN(int n) {
		this.n = n;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return n*sideLength;
	}
	
	public double getArea() {
		return (Math.pow(sideLength, 2) * n) / (4 * Math.tan(Math.PI / n));
	}


}
