import java.util.Random;
import java.util.Scanner;

public class ParallelArrays {
	public void rollDice() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] first;
		int[] second;
		int num;
		int count;
		
		System.out.println("How many times should the dice be rolled?");
		num = sc.nextInt();
		
		first = new int[num];
		second = new int[num];
		
		
		for(int i = 0; i < num; i++) { //Fill arrays with numbers
			first[i] = rand.nextInt(6) + 1;
			second[i] = rand.nextInt(6) + 1;
		}
		
		
		for(int i = 1; i <= 6; i++) { //Loops through combinations
			for(int l = 1; l <= 6; l++) {
				count = 0;
				for(int x = 0; x < num; x++) { //Check if current combination happened
					if((first[x] == i) && (second[x] == l)) {
						count++;
					}
				}
				System.out.println("The combination of " + i + "/" + l + "appeared " + count + " times");
			}
		}
	}
}
