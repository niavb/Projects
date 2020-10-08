package projects07;

import java.util.Scanner;

public class Projects07_zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String word = sc.next();
		word+=sc.nextLine();
		System.out.println("Enter anagram:");
		String anagram = sc.next();
		anagram+=sc.nextLine();
		
		word = word.replaceAll("\\s","");
		anagram = anagram.replaceAll("\\s","");
		
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();
		
		int w = word.length();
		int a = anagram.length();
		
		int allLetters = 0;
		
		for(int i=0; i<w; i++) {
			int wordLetter = word.charAt(i);
			int placeInAnagram = anagram.indexOf(wordLetter);
			if (placeInAnagram>=0) {
				allLetters++;
			}			
		}
		
		if(allLetters==w && allLetters==a)System.out.println("The first word IS an anagram of the other.");
		else System.out.println("The first word is NOT an anagram of the other.");
		
		sc.close();

	}

}
