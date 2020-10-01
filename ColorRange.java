package edu.smg;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		
		String input = JOptionPane.showInputDialog("Enter a color code:");
		double wavelenght = Double.parseDouble(input);
//		System.out.println(wavelenght);
		if(wavelenght < 450 && wavelenght > 380)System.out.println("The color is Violet");
		else if(wavelenght < 495 && wavelenght > 450)System.out.println("The color is Blue");
		else if(wavelenght < 570 && wavelenght > 495)System.out.println("The color is Green");
		else if(wavelenght < 590 && wavelenght > 570)System.out.println("The color is Yellow");
		else if(wavelenght < 620 && wavelenght > 590)System.out.println("The color is Orange");
		else if(wavelenght < 750 && wavelenght > 620)System.out.println("The color is Red");
		else System.out.println("The entered wavelength is not a part of the visible spectrum");
		

	}

}
