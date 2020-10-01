package edu.smg;

import javax.swing.JOptionPane;

public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Enter kg:");
		int kg = Integer.parseInt(input);
		
		String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Choose a planet.",
                "Planets",
                3,
                null,
                planets,
                planets[1]);
		if (input2 == "Mercuty")System.out.println("Your weight on " + input2 + " is " + (double)(kg*0.38) + " kg.");
		else if (input2 == "Venus")System.out.println("Your weight on " + input2 + " is " + (double)(kg*0.91) + " kg.");
		else if (input2 == "Mars")System.out.println("Your weight on " + input2 + " is " + (double)(kg*0.38) + " kg.");
		else if (input2 == "Jupiter")System.out.println("Your weight on " + input2 + " is " + (double)(kg*2.36) + " kg.");
		else if (input2 == "Saturn")System.out.println("Your weight on " + input2 + " is " + (double)(kg*0.92) + " kg.");
		else if (input2 == "Uranus")System.out.println("Your weight on " + input2 + " is " + (double)(kg*0.89) + " kg.");
		else if (input2 == "Neptune")System.out.println("Your weight on " + input2 + " is " + (double)(kg*1.13) + " kg.");

	}

}
