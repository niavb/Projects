package projects08;

import java.util.Scanner;
import java.util.Random;

public class Project08_zad2 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
			int randomIndexToSwap = rd.nextInt(arr.length);
			int swap = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i] = swap;
		}
	    
	    for(int i=0; i<arr.length; i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    sc.close();

	}

}
