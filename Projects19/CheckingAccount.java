package projects19;

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		setOverDraftLimit(overdraftLimit);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overdraftLimit = overDraftLimit;
	}
	
	public void withdraw(double sum) {
		if (sum<0 || sum>balance) {
			System.out.println("Error");
			return;
		}
		if(sum<=overdraftLimit) {
		    balance -= sum;
	    }
	}
	
	public String toString() {
		return "Checking account: " + super.toString();
	}

}
