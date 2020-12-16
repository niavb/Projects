package projects19;

public class SavingAccounts extends Account {
	
	public SavingAccounts(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double sum) {
		if (sum<0 || sum>balance) {
			System.out.println("Error");
			return;
		}
		if(balance >= sum) {
		    balance -= sum;
		}
	}
	
	public String toString() {
		return "Savings account: " + super.toString();
	}

}
