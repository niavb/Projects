package projects08;

import java.util.Scanner;

public class Project08_zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] key = {"D","B","D","C","C","D","A","E","A","D"};
		String[][] student = {{"A","B","A","C","C","D","E","E","A","D"},
				{"D","B","A","B","C","A","E","E","A","D"},
				{"E","D","D","A","C","B","E","E","A","D"},
				{"C","B","A","E","D","C","E","E","A","D"},
				{"A","B","D","C","C","D","E","E","A","D"},
				{"B","B","E","C","C","D","E","E","A","D"},
				{"B","B","A","C","C","D","E","E","A","D"},
				{"E","B","E","C","C","D","E","E","A","D"}
		};
		
//		System.out.println("Enter answer key: ");
//		for(int i=0; i<key.length; i++)
//	    {
//	        key[i] = sc.next();
//	    }
		
//		System.out.println("Enter student answers: ");
//		for(int i=0; i<student.length; i++) {
//			System.out.println("Student " + (i+1));
//			for(int j=0; j<student[i].length; j++) {
//				System.out.println("Question " + (j+1) + ": ");
//				student[i][j] = sc.next();
//			}
//		}
		
		for (int i = 0; i < student.length; i++) { 
			int points = 0;
			for (int j = 0; j < student[i].length; j++) { 
				if(student[i][j]==key[j]) {
					points++;
				}
			}
			System.out.println("Student " + (i+1) + " points: " + points);
		}
		
		sc.close();

	}

}
