package stuff;

import java.util.Scanner;

public class Methods2 {
	
	public static void main(String[] args) { //This program runs the Euclidean algorithm over two numbers
		Scanner sc = new Scanner(System.in);
		Methods2 m = new Methods2();
		int num1, num2;
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("The greatest common factor of the two numbers is " + m.euclidean(num1, num2));
	}
	
	public int euclidean(int x, int y) { //The Euclidean algorithm finds the greatest common factor of two numbers
		int rem = x%y;
		while(rem != 0) {
			x = y;
			y = rem;
			rem = x%y;
		}
		return y;
	}
}
