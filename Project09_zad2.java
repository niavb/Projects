package projects09;

public class Project09_zad2 {

	public static void main(String[] args) {
		int numNumbers = 0;
		int num = 2;
		while (numNumbers <= 120) {	
			    if(isPrime(num) && isPalindromic(num)) {
				    System.out.print(num + " ");
				    numNumbers++;
				    if(numNumbers%10==0) {
				    	System.out.println();
				    }
				    num++;
			    }else num++;
		}

	}
	
	public static boolean isPrime(int num) {
		boolean prime = true;
		
		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
        }
		return prime;
	}
	
	public static boolean isPalindromic(int num) {
		boolean palindrome = false;
		int  rev=0, x, numNormal; 
        numNormal = num;
  
        while( num != 0 )
        {
            x = num % 10;
            rev = rev * 10 + x;
            num =num/10;
        }
  
        if (numNormal == rev) palindrome = true;
        return palindrome;

	}

}
