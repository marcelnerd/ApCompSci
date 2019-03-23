package stuff;

import java.util.Scanner;

public class Employee {
	private int idNum;
	private double salary;
	private int years;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		Employee dave = new Employee();
		dave.newEmployee();
		
		do {
			
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("0) Exit");
			System.out.println("1) Anniversary");
			System.out.println("2) Raise");
			System.out.println("3) Bonus");
			answer = sc.nextInt();
			
			switch(answer) {
			case 0: break;
			
			case 1:
				dave.anniversary();
				break;
			case 2:
				System.out.println("How much do you want to raise?");
				dave.raise(sc.nextInt());
				break;
			case 3:
				dave.bonus();
			}
		} while(answer != 0);
	}
	
	public void newEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the employees id number?");
		this.idNum = sc.nextInt();
		System.out.println("What is the employee's salary?");
		this.salary = sc.nextInt();
		System.out.println("How long has the employee been with the company?");
		this.years = sc.nextInt();
	}
	
	public void anniversary() {
		years++;
		System.out.println("Congradulations on " + years + " years at the company");
	}
	
	public void raise(double perc) {
		salary += (salary * (perc/100));
		System.out.println("New salary is " + salary);
	}
	
	public double bonus() {
		if(years < 11) {
			System.out.println("Gave bonus of " + salary*0.05);
			return salary*0.05;
		}
		else {
			System.out.println("Gave bonus of " + salary*0.1);
			return salary*0.1;
		}
	}
}
