import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO_2 {
	
	public void runStuff() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("FileIO2Input.txt")); //File to read in
		PrintWriter wr = new PrintWriter(new File("FileIO2Output.txt")); //File to write to
		String word, half1, half2;
		
		while(sc.hasNext()) { //Loops through words
			word = sc.nextLine(); //Read next word
			word = word.toUpperCase(); //Make upper case
			
			//Get two halfs of word
			half1 = word.substring(0, word.length()-2);
			half2 = word.substring((word.length())/2, word.length());
			
			System.out.println(half1 + " " + half2);
			wr.write(half1 + " " + half2);
			wr.close();
		}
	}
}
