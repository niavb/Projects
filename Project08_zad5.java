package projects08;

import java.util.Scanner;

public class Project08_zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int maxSum = 0;
		int rowOfMaxSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				if(sum>maxSum) {
					maxSum=sum;
					rowOfMaxSum=i;
				}
			}
		}
		
		System.out.println("Row of max sum is: " + (rowOfMaxSum+1));
		
		sc.close();

	}

}
