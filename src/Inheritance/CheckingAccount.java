package Inheritance;

public class CheckingAccount extends Account {
	
	public CheckingAccount() {
		super();
	}
	
	@Override
	public void withdrawal(float amount) {
		System.out.println("Withdrawaling $" + amount);
		balance -= amount + 1;
		
		if(balance < 0) {
			balance -= 10;
		}
	}
}
