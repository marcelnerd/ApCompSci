package Inheritance;

public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
		balance = 100;
	}
	
	@Override
	public void withdrawal(float amount) {
		if(balance - amount < 0) {
			System.out.println("Insufficient funds. Transaction canceled");
			return;
		}
		else {
			System.out.println("Withdrawaling $" + amount);
			balance -= amount;
		}
	}
}
