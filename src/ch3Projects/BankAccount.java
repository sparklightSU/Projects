package ch3Projects;

public class BankAccount {
	private double balance;

	public BankAccount() {
		balance = 0;
	}
	public void deposit(double money) {
		balance += money;
	}
	public void withdraw(double money) {
		balance-=money;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
