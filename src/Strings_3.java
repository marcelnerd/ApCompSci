import java.util.Scanner;

public class Strings_3 {
	char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	int offset = 5;
	
	public void readIn() {
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("Enter \"e\" to encrypt or \"d\" to decrypt"); // Encrypt or decrypt
		input = sc.nextLine();
		
		if(input.equals("e")) {
			System.out.println("please enter word to be encrypted");
			input = sc.nextLine();
			System.out.println("Encrypted word: " + encrypt(input));
		}
		else {
			System.out.println("please enter word to be decrypted");
			input = sc.nextLine();
			System.out.println("Decrypted word: " + decrypt(input));
		}
	}
	
	private String encrypt(String word) {
		String eWord = "";
		for(int i = 0; i < word.length(); i++) {
			if(getCharIndex(word.charAt(i)) + 5 > 25) { //Check for array overflow
				eWord += alph[(getCharIndex(word.charAt(i)) + 5) - 25]; // Wrap around to bottom of alphabet
			}
			else {
				eWord += alph[getCharIndex(word.charAt(i)) + 5];
			}
		}
		return eWord;
	}
	
	private String decrypt(String word) {
		String dWord = "";
		for(int i = 0; i < word.length(); i++) {
			if(getCharIndex(word.charAt(i)) - 5 < 0) { //Check for array underflow
				dWord += alph[25 - (getCharIndex(word.charAt(i)) + 5)]; //Wrap around to top of alphabet
			}
			else {
				dWord += alph[getCharIndex(word.charAt(i)) - 5];
			}
		}
		return dWord;
	}
	
	private int getCharIndex(char c) {
		for(int i = 0; i < alph.length; i++) {
			if(alph[i] == c) {
				return i;
			}
		}
		return -43;
	}
	
}
