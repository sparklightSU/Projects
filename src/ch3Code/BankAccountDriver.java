package ch3Code;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.deposit(1000000);
		System.out.println(ba.getBalance());
	}

}
