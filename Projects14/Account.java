package projects14;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double yearInterestRate = 0;
	private Date dateCreated = new Date();
	//
	public Account(){
		setId(0);
		setBalance(0);
	}
	//
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getYearInterestRate() {
		return yearInterestRate;
	}
	public static void setYearInterestRate(double yearInterestRate2) {
		yearInterestRate = yearInterestRate2;
	}
	public Date getDate() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance*(getMonthlyInterestRate()/100);
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	
	public void withdraw(double sum) {
		if (sum<0 || sum>balance) {
			System.out.println("Error");
			return;
		}
		balance -= sum;
	}

}
