import java.util.Scanner;

public class Arrays1 {
	
	public void runSpeeds() {
		int max = 0, min = 0, overTen = 0, overTwenty = 0, overPlus = 0;
		double average = 0;
		Scanner sc = new Scanner(System.in);
		int speeds[] = new int[10];
		System.out.println("Please enter ten speeds");
		
		for(int i = 0; i < speeds.length; i++) { //Loops through ten speeds
			System.out.println("Next speed: ");
			speeds[i] = sc.nextInt();
			average += speeds[i];
			
			if(i == 0) { //Initialize max and min
				max = speeds[i];
				min = speeds[i];
			}
			
			if(speeds[i] > max) { //Reset max
				max = speeds[i];
			}
			if(speeds[i] < min) { //Reset min
				min = speeds[i];
			}
			
			if(speeds[i] > 55) { //Check people over limit
				if(speeds[i] < 65) {
					overTen++;
				}
				else if(speeds[i] < 75) {
					overTwenty++;
				}
				else {
					overPlus++;
				}
			}
		}
		
		average /= speeds.length;
		System.out.println("Average speed was " + average);
		System.out.println("Number of people less than ten over limit: " + overTen);
		System.out.println("Number of people less than twenty over limit: " + overTwenty);
		System.out.println("Number of people more than twenty over limit: " + overPlus);
		
		System.out.println("Highest Speed: " + max);
		System.out.println("Lowest Speed: " + min);
	}
}
