package projects06;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		Scanner client = new Scanner(System.in);
		System.out.println("What's the height of your room?");
		double height = client.nextDouble();
		System.out.println("What's the length of your room?");
		double length = client.nextDouble();
		System.out.println("What's the width of your room?");
		double width = client.nextDouble();
		double room = (length*width)+(2*length*height)+(2*width*height);
		int fiveL=0, oneL=0;
		if (room % 140 >= 90) fiveL = (int)(Math.ceil(room / 140.0));
		else {
			fiveL = (int)(Math.floor(room / 140.0));
			oneL = (int)(Math.ceil((room - fiveL*140)/30));
		}
		System.out.println("You will need " + fiveL + " 5-liter buckets and " + oneL + " 1-liter buckets.");
		System.out.println(room);
		
		client.close();

	}

}
