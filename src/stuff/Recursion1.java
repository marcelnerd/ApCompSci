package stuff;

import java.util.Scanner;

public class Recursion1 {
	public static void main(String[] args) {
		Recursion1 r = new Recursion1();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = sc.nextInt();
		//System.out.println("Reversed number: " + r.reverse(num));
		System.out.print("Reversed number: ");
		//System.out.println((int) (Math.log10(num) + 1));
		r.reverse(num, 1);
		
	}
	
	public void reverse(int n, int count) {
		//System.out.println(count + "ffff");
		if(count <= (int) (Math.log10(n) + 1)) { //If the count is less than the length of the number
		System.out.print((int) ((((int) (n % Math.pow(10, count))) - ((int) (n % Math.pow(10, count-1)))) / Math.pow(10, count-1)));
		reverse(n, count+1);
		}
	}
}
