import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		
		Abstract3 lock = new Abstract3();
		lock.setcombo(34, 2, 25);
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("What would you like to do?\n-1) Exit program\n1) Check if locked\n2) Unlock");
		input = sc.nextInt();
		
		switch(input) {
		case -1:
			System.exit(0);
			break;
		case 1:
			if(lock.isLocked()) {
				System.out.println("The lock is locked");
			}
			else {
				System.out.println("The lock is not locked");
			}
			break;
		case 2:
			int num1, num2, num3;
			System.out.println("Enter the three numbers that you want to try to unlock with");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			lock.unlock(num1, num2, num3);
		}
	}

}
