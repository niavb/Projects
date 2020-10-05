package edu.smg;

import java.util.Scanner;

public class Project07_zad3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
		System.out.println("Choose number(1-15): ");
		int num = sc.nextInt();
		
		while(num>0){
		
		for(int i=num; i>1; i--){
			System.out.print(i);
		}
		for(int j=0; j<num;j++){
			System.out.print(j+1);
		}
		num--;
		System.out.println();
		}
		

	}

}
