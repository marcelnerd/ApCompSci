package stuff;
import java.util.Scanner;

public class Methods1 {
	public static void main(String[] args) { //This program allows the user to pick between different unit conversions
		Methods1 methods = new Methods1();
		int choice;
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please pick an option:");
		System.out.println("1 - Feet To Inches");
		System.out.println("2 - Centimeters to Inches");
		System.out.println("3 - Miles to Meters");
		System.out.println("4 - Miles to Feet");
		System.out.println("5 - Pounds to Ounces");
		System.out.println("6 - Kilowatts to Horsepower");
		choice = sc.nextInt();
		
		System.out.println("What is the quantity that you would like to convert?");
		num = sc.nextDouble();
		
		System.out.print("Converted: ");
		
		switch(choice) {
		case 1:
			System.out.println(methods.feetToInches(num));
			break;
		case 2:
			System.out.println(methods.centToInches(num));
			break;
		case 3:
			System.out.println(methods.milToMet(num));
			break;
		case 4:
			System.out.println(methods.milToFeet(num));
			break;
		case 5:
			System.out.println(methods.lbToOz(num));
			break;
		case 6:
			System.out.println(methods.kwToHp(num));
			break;
		}
	}
	
	public double feetToInches(double n) {
		return n*12;
	}
	
	public double centToInches(double n) {
		return n/2.54;
	}
	
	public double milToMet(double n) {
		return n*1609.34;
	}
	
	public double milToFeet(double n) {
		return n * 5280;
	}
	
	public double lbToOz(double n) {
		return n*16;
	}
	
	public double kwToHp(double n) {
		return n*1.34102;
	}
}
