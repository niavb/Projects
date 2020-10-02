package edu.smg;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
    	
        
//        JOptionPane.showMessageDialog(null,
//                "There's no input here, just a message",
//                "Title",
//                0);
//
//        
//        String input1 = (String)JOptionPane.showInputDialog(null,
//                "Is this a question?",
//                "Dialog Title",
//                2,
//                null,
//                null,
//                "Type something here.");
//        
//        
//        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
    	
        String[] deserts = {"Ice cream", "Pancake", "Donut", "Sufle"};
        String input = (String)JOptionPane.showInputDialog(null,
                "Choose a desert.",
                "Desserts",
                3,
                null,
                deserts,
                deserts[0]);
                
    }
}
