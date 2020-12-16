package projects19;

public class Zad2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1, 100);
		CheckingAccount chAcc = new CheckingAccount(2, 100, 50);
		SavingAccounts savAcc = new SavingAccounts(3, 100);
		
		account.withdraw(20);
		chAcc.withdraw(60);
		savAcc.withdraw(30);
		System.out.println(account.toString());
		System.out.println(chAcc.toString());
		System.out.println(savAcc.toString());
		chAcc.withdraw(40);
		System.out.println(chAcc.toString());
		

	}

}
