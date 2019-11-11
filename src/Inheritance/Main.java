package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1, input2;
		float amount;
		CheckingAccount ca = new CheckingAccount();
		SavingsAccount sa = new SavingsAccount();
		
		while(true) {
			System.out.println("Would you like to use checkings or savings? Enter -1 to exit\n\n1) Checking\n2) Saving");
			input1 = sc.nextInt();
			
			if(input1 == -1) { // Exit the program
				return;
			}
			
			System.out.println("Would you like to withdrawal or deposit or check your balance?\n\n1) Withdrawal\n2) Deposit\n3) Show balance");
			input2 = sc.nextInt();
			
			System.out.println("What amount?");
			amount = sc.nextFloat();
			
			switch(input1) { // Checking or saving 
			case 1:
				switch(input2) { // Withdrawal or deposit show balance
				case 1:
					ca.withdrawal(amount);
					break;
				case 2:
					ca.deposit(amount);
					break;
				case 3:
					ca.showBalance();
					break;
				}
				break;
			case 2:
				switch(input2) { //Withdrawal or deposit or show balance
				case 1:
					sa.withdrawal(amount);
					break;
				case 2:
					sa.deposit(amount);
					break;
				case 3:
					sa.showBalance();
					break;
				}
				break;
			}
		}
	}
}
