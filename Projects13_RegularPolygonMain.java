package projects13;

public class Projects13_RegularPolygonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegularPolygon RP1 = new RegularPolygon();
		RegularPolygon RP2 = new RegularPolygon(6, 4);
		RegularPolygon RP3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("RP1: Area:" + RP1.getArea() + " Perimeter:" + RP1.getPerimeter());
		System.out.println("RP2: Area:" + RP2.getArea() + " Perimeter:" + RP2.getPerimeter());
		System.out.println("RP3: Area:" + RP3.getArea() + " Perimeter:" + RP3.getPerimeter());

	}

}
