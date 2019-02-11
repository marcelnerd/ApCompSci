import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ForcefulHello.newMain();
		//farToCel();
		//daysToMinutes();
		//sphereInfo();
		//ifStatements_1();
		//ifStatements_2();
		//ifStatements_3();
		//switchStatements_1();
		//loops_1();
		//loops_1_challenge_1();
		//loops_1_challenge_2();
		//loops_2();
		//loops_3();
		//loops_4();
		//nested_loops_1();
		//nested_loops_2();
		nested_loops_3();
	}
	
	public static void nested_loops_3() { //This program prints out a multiplication table
		System.out.println("----+-----------------------------------------------------------------------");
		System.out.println("      | 1    2     3     4       5     6      7     8       9     10    11    12");
		System.out.println("----+-----------------------------------------------------------------------");
		
		for(int i = 1; i < 13; i++) { //Loops through rows
			System.out.print(i + "     | ");
			for(int l = 1; l < 13; l++) { //Loops through columns
				System.out.print((i*l) + "     ");
			}
			System.out.println();
		}
		
	}
	
	public static void nested_loops_2() { //This program prints a pattern a number of times based on a number entered by the user
		int num; //Number of times for the pattern to run
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = sc.nextInt();
				
		for(int i = 0; i < num; i++) { //Print the first half of the loop
			for(int l = 0; l<i; l++) {
				System.out.print("?");

			}
			System.out.println("#");
		}
		for(int l = num-2; l>=0; l--) { //Print the second half of the loop
			for(int i = l-1; i > -1; i--) {
				System.out.print("?");
			}
			System.out.println("#");
		}
	}
	
	public static void nested_loops_1() { //This program prints a pattern a number of times based on a number entered by the user
		int num; //Number of times for the pattern to run
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = sc.nextInt();
		System.out.println(); //This simply adds an empty line, for visual purposes
		
		for(int i = 0; i < num; i++) { // Loops through the number of lines
			System.out.print("*");
			for(int l = 0; l < num-2; l++) { // Loops through the actual pattern on each line
				System.out.print("#");
			}
			System.out.println("*");
		}
		
	}
	
	public static void loops_4() { //This program prints all prime numbers between 1 and 100
		boolean flag;
		for(int i = 1; i <= 100; i++) {
			flag = true;
			for(int x = 2; x < i; x++) {
				if(i%x == 0) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(i + " is a prime number");
			}
			
		}
	}
	
	public static void loops_3() { //This program has the computer try to "guess" a number between 1 and 20, and loops until it guesses correctly
		int answer, guess;
		Random rand = new Random();
		answer = rand.nextInt(20) + 1; //This sets the answer to a random number between 1 and 20
		System.out.println("The computer is trying to guess a number. The correct answer is: " + answer);
		
		do {
			guess = rand.nextInt(20) + 1; //This guesses a random number between 1 and 20
			System.out.println("The computer guessed " + guess);
		} while(guess != answer);
		
		System.out.println("The computer guessed correctly!");
	}
	
	public static void loops_2() { //This program has the user guess a number between 1 and 20. The program loops until the user guesses the correct answer
		int answer, num = -1;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		answer = rand.nextInt(20) + 1; //This sets the answer to a random number between 1 and 20
		System.out.println("Let's play a guessing game. Try to guess a number that is between 1 and 20");
		while (num != answer) {
			System.out.println("Enter a number to guess");
			num = sc.nextInt();
			
			if(num < answer) {
				System.out.println("Too low");
			}
			else if(num > answer) {
				System.out.println("Too high");
			}
			else if(num == answer) {
				System.out.println("Correct!");
				break;
			}
			else {
				System.out.println("Wrong. Guess again");
			}
			
		}
		
	}
	
	public static void loops_1_challenge_2() { //This program adds all numbers between two numbers that the user enters that are divisible by a third number that the user enters
		int num1, num2, num3, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		System.out.println("Please enter the number to divide by");
		num3 = sc.nextInt();
		
		if(num1 < num2) { //This checks if the loop should start at num1 or num2, based on which is higher
			for(int i = num1; i<=num2; i++) {
				if(i%num3 == 0) {
					total += i;
				}
			}
			System.out.println("The total is: " + total);
		}
		else {
			for(int i = num2; i<=num1; i++) {
				if(i%num3 == 0) {
					total += i;
				}			
			}
			System.out.println("The total is: " + total);
		}
	}
	
	public static void loops_1_challenge_1() { //This program adds all even number in between two numbers that the user enters
		int num1, num2, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		
		if(num1 < num2) { //This checks if the loop should start at num1 or num2, based on which is higher
			for(int i = num1; i<=num2; i++) {
				if(i%2 == 0) { //This checks if the number is even or not
					total += i;
				}
			}
			System.out.println("The total is: " + total);
		}
		else {
			for(int i = num2; i<=num1; i++) {
				if(i%2 == 0) {
					total += i;
				}			}
			System.out.println("The total is: " + total);
		}
	}
	
	public static void loops_1() { //This program outputs the sum of the numbers between two numbers entered by the user
		int num1, num2, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		
		if(num1 < num2) { //This checks if the loop should start at num1 or num2, based on which is higher
			for(int i = num1; i<=num2; i++) {
				total += i;
			}
			System.out.println("The total is: " + total);
		}
		else {
			for(int i = num2; i<=num1; i++) {
				total += i;
			}
			System.out.println("The total is: " + total);
		}
	}
	
	public static void switchStatements_1() {
		int month, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of a month");
		month = sc.nextInt();
		System.out.println("Please enter a year");
		year = sc.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("There are 31 days in January " + year);
				break;
			case 2:
				if((year % 4) == 0) { // This checks if the current year is a leap year
					System.out.println("There are 29 days in February " + year);
				}
				else {
					System.out.println("There are 28 days in February " + year);
				}
				break;
			case 3:
				System.out.println("There are 31 days in March " + year);
				break;
			case 4:
				System.out.println("There are 30 in April " + year);
				break;
			case 5:
				System.out.println("There are 31 days in May " + year);
				break;
			case 6:
				System.out.println("There are 30 days in June " + year);
				break;
			case 7:
				System.out.println("There are 31 days in July " + year);
				break;
			case 8:
				System.out.println("There are 31 days in August " + year);
				break;
			case 9:
				System.out.println("There are 30 days in September " + year);
				break;
			case 10:
				System.out.println("There are 31 days in October " + year);
				break;
			case 11:
				System.out.println("There are 30 days in November " + year);
				break;
			case 12:
				System.out.println("There are 31 days in December " + year);
				break;
			default:
				System.out.println("Invalid year");
		}
	}
	
	public static void ifStatements_3() { //Program takes in grade the user got on a test and outputs the letter grade that they got
		double grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your test score");
		grade = sc.nextDouble();
		
		if(grade < 60) {
			System.out.println("You got an F on the test");
		}
		else if(grade < 70) {
			System.out.println("You got a D on the test");
		}
		else if(grade < 80) {
			System.out.println("You got a C on the test");
		}
		else if(grade < 90) {
			System.out.println("You got a B on the test");
		}
		else if(grade <= 100) {
			System.out.println("You got an A on the test");
		}
		else {
			System.out.println("You got an A+, above a 100%, nice!");
		}
		
	}
	
	public static void ifStatements_2() { //This program takes in three numbers as an input, and outputs which is larger, and the average
		double num1, num2, num3, highest, smallest, average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three number");
		
		System.out.println("First number: ");
		num1 = sc.nextDouble();
		highest = num1;
		smallest = num1;
		
		System.out.println("Second number: ");
		num2 = sc.nextDouble();
		if(highest < num2) {
			highest = num2;
		}
		else {
			smallest = num2;
		}
		
		System.out.println("Third number: ");
		num3 = sc.nextDouble();
		if(highest < num3) {
			highest = num3;
		}
		else if (num3 < smallest) {
			smallest = num3;
		}
		
		average = (num1 + num2 + num3) / 3;
		System.out.println("Smallest: " + smallest);
		System.out.println("Highest: " + highest);
		System.out.println("Average: " + average);
		
	}
	
	public static void ifStatements_1() { //This program takes in the number of different types of videos that the user rents, and outputs the total cost
		int type3, type2;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many $3 movies are you renting?");
		type3 = sc.nextInt();
		System.out.println("How many $2 movies are you renting?");
		type2 = sc.nextInt();
		System.out.println("Your total cost is: $" + ((type3*3)+(type2*2)));
	
	}
	
	public static void sphereInfo() { //This program outputs information about a sphere, given it's radius
		double radius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the radius of a sphere");
		radius = sc.nextDouble();
		
		System.out.println("Diameter: " + 2*radius);
		System.out.println("Surface Area: " + 4*3.14159*radius*radius);
		System.out.println("Circumference: " + 3.14159*2*radius);
		System.out.println("Volume: " + ((4/3)*3.14159*Math.pow(radius, 3)));
	}
	
	
	public static void daysToMinutes() { //Program reads in a number of days and converts to minutes
		int days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of days");
		days = sc.nextInt();
		System.out.println("Minutes: " + days*24*60);
	}
	
	public static void farToCel() { //Program reads in a temperature in Fahrenheit and convert the temperature to Celcius
		double far, cel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature");
		far = sc.nextDouble();
		cel = ((far - 32) * 5) / 9;
		System.out.println("Temperature in Celcius: " + cel);
	}

}
