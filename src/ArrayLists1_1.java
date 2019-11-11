import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists1_1 {
	ArrayList<Integer> nums;
	int OneTen = 0, TenTwenty = 0, TwentyThirty = 0, ThirtyFourty = 0, FourtyFifty = 0, FiftySixty = 0, SixtySeventy = 0, SeventyEighty = 0, EightyNinety = 0, NinetyHundred = 0;
	
	public ArrayLists1_1() {
		nums = new ArrayList<Integer>();
		
	}

	public void runMoreStuff() {
		int entry;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number between 1 and 100. Enter a negative number to exit");
			entry = sc.nextInt();
			
			if(entry>0 && entry<101) {
				nums.add(entry);
			}
			else {
				break;
			}
		}
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) > 90) {
				NinetyHundred++;
			}
			else if(nums.get(i) > 80) {
				EightyNinety++;
			}
			else if(nums.get(i) > 70) {
				SeventyEighty++;
			}
			else if(nums.get(i) > 60) {
				SixtySeventy++;
			}
			else if(nums.get(i) > 50) {
				FiftySixty++;
			}
			else if(nums.get(i) > 40) {
				FourtyFifty++;
			}
			else if(nums.get(i) > 30) {
				ThirtyFourty++;
			}
			else if(nums.get(i) > 20) {
				TwentyThirty++;
			}
			else if(nums.get(i) > 10) {
				TenTwenty++;
			}
			else {
				OneTen++;
			}
		}
		
		for(int i = 0; i < 10; i ++) {
			switch(i) {
			case 0:
				System.out.print("1 - 10  | ");
				for(int x = 0; x < OneTen; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 1:
				System.out.print("11 - 20 | ");
				for(int x = 0; x < TenTwenty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 2:
				System.out.print("21 - 30 | ");
				for(int x = 0; x < TwentyThirty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 3: 
				System.out.print("31 - 40 | ");
				for(int x = 0; x < ThirtyFourty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 4:
				System.out.print("41 - 50 | ");
				for(int x = 0; x < FourtyFifty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 5:
				System.out.print("51 - 60 | ");
				for(int x = 0; x < FiftySixty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 6:
				System.out.print("61 - 70 | ");
				for(int x = 0; x < SixtySeventy; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 7:
				System.out.print("71 - 80 | ");
				for(int x = 0; x < SeventyEighty; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 8:
				System.out.print("81 - 90 | ");
				for(int x = 0; x < EightyNinety; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 9:
				System.out.print("91 - 100| ");
				for(int x = 0; x < NinetyHundred; x++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			}
		}
	}
}
