import java.util.Scanner;

public class Overloading_1 {
	public void runStuff() {
		Scanner sc = new Scanner(System.in);
		int input;
		double num1, num2, answer;
		
		System.out.println("Would you like to add, subtract, multiply, or divide? \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n\n");
		input = sc.nextInt();
		System.out.println("What two numbers would you like to operate on? Enter the first number");
		num1 = sc.nextDouble();
		System.out.println("Enter the second number");
		num2 = sc.nextDouble();
		
		switch(input) { //Determine which operation to use
		case 1:
			answer = add(num1, num2);
			break;
		case 2:
			answer = subtract(num1, num2);
			break;
		case 3:
			answer = multiply(num1, num2);
			break;
		case 4:
			answer = divide(num1, num2);
			break;
		default:
			answer = -45;
		}
		System.out.println("The result is " + answer);
	}
	
	private double add(double num1, double num2) {
		return num1 + num2;
	}
	
	private float add(float num1, float num2) {
		return num1 + num2;
	}
	
	private int add(int num1, int num2) {
		return num1 + num2;
	}
	
	private double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	private float subtract(float num1, float num2) {
		return num1 - num2;
	}
	
	private int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	private double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	private float multiply(float num1, float num2) {
		return num1 * num2;
	}
	
	private int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	private double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	private float divide(float num1, float num2) {
		return num1 / num2;
	}
	
	private int divide(int num1, int num2) {
		return num1 / num2;
	}
}
