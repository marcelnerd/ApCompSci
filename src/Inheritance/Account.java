package Inheritance;

public class Account {
	float balance;
	
	public Account() {
		balance = 0;
	}
	
	public void withdrawal(float amount) {
		System.out.println("Withdrawaling $" + amount);
		balance -= amount;
	}
	
	public void deposit(float amount) {
		System.out.println("Depositing $" + amount);
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
}
