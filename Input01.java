package edu.smg;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
//        String input = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(input);
        
        
        //Parse the input as an int.
        //Print its value +1
//        int input = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
//        input++;
//        System.out.println(input);
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
    	System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Input a number"))+ 1);
        
       
    }
}
