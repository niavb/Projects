package projects08;

import java.util.Scanner;

public class Project08_zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows? ");
		int a = sc.nextInt();
		System.out.println("Columns? ");
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		
		for (int i = 0; i < a; i++) { 
			for (int j = 0; j < b; j++) { 
				arr[i][j] = sc.nextInt();
			} 
		} 
		
		System.out.println("Normal: ");
		for (int i = 0; i < a; i++) { 
			for (int j = 0; j < b; j++) { 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose: ");
		for (int j = 0; j < b; j++) { 
			for (int i = 0; i < a; i++) { 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
