package projects10;

public class SavingsAccount {
	public double balance;
	public double interestRate = 0.01;
	public static String name;
	
	public void deposit(double sum) {
		balance += sum;
		System.out.println("Succsessful deposit " + sum + " new balance " + balance);
	}
	
	public void withdraw(double sum) {
		if (sum<0 || sum>balance) {
			System.out.println("Error");
			return;
		}
		balance -= sum;
		System.out.println("Succsessful withdraw " + sum + " new balance " + balance);
	}

}
