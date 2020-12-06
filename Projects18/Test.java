package projects18;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		double side1=0, side2=0, side3=0;
		
		do {
		System.out.println("Enter sides: ");
		System.out.println("Side1: ");
		side1 = sc.nextDouble();
		System.out.println("Side2: ");
		side2 = sc.nextDouble();
		System.out.println("Side3: ");
		side3 = sc.nextDouble();
		if(((side1 + side2) <= side3) || ((side3 + side2) <= side1) || ((side1 + side3) <= side2)){
			System.out.println("Triangle does not exist. Please enter another sides: ");
		}
		}while(((side1 + side2) <= side3) || ((side3 + side2) <= side1) || ((side1 + side3) <= side2));
		System.out.println("Enter color: ");
		String color = sc.next();
		System.out.println("Filled: ");
		boolean filled = sc.nextBoolean();
		
		Triangle one = new Triangle(side1, side2, side3);
		one.setColor(color);
		one.setFilled(filled);
		
		one.printRectangle();
		System.out.println("The area is: " + one.getArea());
		System.out.println("The parameter is: " + one.getParameter());
		System.out.println("A triangle " + one.toString());
		
		sc.close();

	}

}
