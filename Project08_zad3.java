package projects08;

import java.util.Scanner;

public class Project08_zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    
	    int last = arr[arr.length-1];
	    
	    for(int i=arr.length-1; i>=0; i--) {
	    	if(i<arr.length-1) {
	    	arr[i+1]=arr[i];
	    	}
	    }
	    arr[0]=last;
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        System.out.print(arr[i]);
	    }
	    
	    sc.close();

	}

}
