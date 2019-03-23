package stuff;

import java.util.Scanner;

public class Recursion2 {
	public static void main(String[] args) {
		Recursion2 rec = new Recursion2();
		Scanner sc = new Scanner(System.in);
		int num, pow;
		
		System.out.println("Please enter number");
		num = sc.nextInt();
		System.out.println("Please enter power to raise the number to");
		pow = sc.nextInt();
		rec.recPow(num, num, pow, 1);
	}
	
	public void recPow(int n, int result, int p, int count) {
		if(count == p) { //If the number has been multiplied the correct number of times
			System.out.println(result);
		}
		else {
			recPow(n, result*n, p, count+1); //Call function again with multiplied value and increment count
		}
	}
}
