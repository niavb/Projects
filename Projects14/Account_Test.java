package projects14;

public class Account_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account one = new Account(1122, 20000);
		Account.setYearInterestRate(4.5);
		one.withdraw(2500);
		one.deposit(3000);
		System.out.println("Balance: " + one.getBalance() + "; Monthly Interest: " + one.getMonthlyInterest() + "; Date: " + one.getDate());

	}

}
