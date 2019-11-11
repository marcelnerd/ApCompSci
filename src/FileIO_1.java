import java.util.Scanner;

public class FileIO_1 {
	
	public void readIn() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Please enter sentence");
		input = sc.nextLine();
		System.out.println("Without vowels:");
		System.out.println(removeVowels(input));
	}
	
	public String removeVowels(String s) {
		return s.replaceAll("[aeiouAEIOU]", "");
	}
}
