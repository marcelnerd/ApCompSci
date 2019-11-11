import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Abstract1 implements PhoneBook {
	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public void runStuff() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		ReadInfo();
		
		while(input >= 0) {
			System.out.println("What would you like to do?\n1) Find phone number\n2) Find name\n-1) Exit program\n\n");
			
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1:
				System.out.println("Enter name");
				String name = sc.nextLine();
				System.out.println(FindNumber(name));
				 break;
			case 2:
				System.out.println("Enter number");
				String num = sc.nextLine();
				sc.nextLine();
				System.out.println(FindName(num));
				 break;
			case -1:
				break;
			}
		}
	}
	
	@Override
	public void ReadInfo() { //Read names and numbers
		try {
			Scanner sc = new Scanner(new File("phoneNames.txt"));
			while(sc.hasNext()) {
				names.add(sc.nextLine());
			}
			
			sc = new Scanner(new File("phoneNums.txt"));
			while(sc.hasNext()) {
				nums.add(sc.nextInt());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String FindNumber(String name) { //Find a number based on a name
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).equals(name)) {
				return nums.get(i).toString();
			}
		}
		return null;
	}

	@Override
	public String FindName(String phonenumber) { //Find a name based on a number
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == Integer.parseInt(phonenumber)) {
				return nums.get(i).toString();
			}
		}
		return null;
	}
	
}
