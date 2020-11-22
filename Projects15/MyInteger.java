package projects15;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven() {
		if(getValue()%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if(getValue()%2==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isPrime() {
		if (getValue() <= 1) {
		       return false;
		   }
		   for (int i = 2; i <= Math.sqrt(getValue()); i++) {
		       if (getValue() % i == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	
	public static boolean isEven(int value) {
		if(value%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isOdd(int value) {
		if(value%2==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isPrime(int value) {
		if (value <= 1) {
		       return false;
		   }
		   for (int i = 2; i <= Math.sqrt(value); i++) {
		       if (value % i == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	
	public static boolean isEven(MyInteger val) {
		if(val.getValue()%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger val) {
		if(val.getValue()%2==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isPrime(MyInteger val) {
		if (val.getValue() <= 1) {
		       return false;
		   }
		   for (int i = 2; i <= Math.sqrt(val.getValue()); i++) {
		       if (val.getValue() % i == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	
	public boolean equals(int value) {
		if (value == getValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(MyInteger value) {
		if (value.getValue() == getValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int parseInt(char[] arr){      
		int sum = 0;
        for (int i=0; i<arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
	}
	
	 public static int parseInt(String value) {
	        return Integer.parseInt(value);
	    }
	
	

}
