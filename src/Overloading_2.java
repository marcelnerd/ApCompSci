import java.util.Scanner;

public class Overloading_2 {
	
	public void runStuff() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3 = -1;
		boolean haveThird = false;
		
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		System.out.println("Would you like to enter a third number? Enter '0' for no, and '1' for yes");
		if(sc.nextInt() == 1) {
			System.out.println("Please enter third number");
			num3 = sc.nextInt();
			haveThird = true;
		}
		
		if(haveThird) {
			compareNums(num1, num2, num3);
		}
		else {
			compareNums(num1, num2);
		}
	}
	
	public void compareNums(int num1, int num2) {
		if(num1 == num2) {
			System.out.println("The two numbers are equal");
		}
		else {
			System.out.println("The two numbers are not equal");
		}
	}
	
	public void compareNums(int num1, int num2, int num3) {
		boolean twoEqual = false;
		if(num1 == num2) {
			System.out.println("The first two numbers are equal");
			twoEqual = true;
		}
		if(num1 == num3) {
			System.out.println("The first and third numbers are equal");
			twoEqual = true;
		}
		if(num2 == num3) {
			System.out.println("The second and third numbers are equal");
			twoEqual = true;
		}
		if(!twoEqual) {
			System.out.println("None of the numbers are equal");
		}
	}
}
