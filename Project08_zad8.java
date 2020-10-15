package edu.smg;

import java.util.Scanner;

public class Project08_zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] sudoku = {{5,3,0,0,7,0,0,0,0},
				          {6,0,0,1,9,5,0,0,0},
				          {0,9,8,0,0,0,0,6,0},
				          {8,0,0,0,6,0,0,0,3},
				          {4,0,0,8,0,3,0,0,1},
				          {7,0,0,0,2,0,0,0,6},
				          {0,6,0,0,0,0,0,0,0},
				          {0,0,0,4,1,9,0,0,5},
				          {0,0,0,0,8,0,0,7,9}};
		for(int i=0; i<9; i++){
		row(i, sudoku);
		}
		
		
		sc.close();
}
	public static void row(int numRow, int[][]wholeRow){
		int swap;
		int arr[] = {1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<9; i++){
//			arr[i] = wholeRow[numRow][j];
//		}
		for(int i=0; i<9; i++){
			for(int j=0; j<9-i; j++){
				if(wholeRow[numRow][j]>wholeRow[numRow][j+1]){
					swap = wholeRow[numRow][j];
					wholeRow[numRow][j]=wholeRow[numRow][j+1];
					wholeRow[numRow][j+1]=swap;
				}
			}
		}
		for(int i=0; i<9; i++){
			if(arr[i]==wholeRow[numRow][i])System.out.println("Row " + numRow + "is ok.");
			else System.out.println("Row " + numRow + "is NOT ok.");
		}
	}
}