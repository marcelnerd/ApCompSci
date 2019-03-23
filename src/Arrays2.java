import java.util.Random;

public class Arrays2 {
	public void runThing() {
		Random rand = new Random();
		int nums[] = new int[101];
		int counts[] = new int[101];
		
		for(int i = 0; i < counts.length; i++) { //keep track of recurrence of numbers
			counts[i] = 0;
		}
		
		for(int i = 0; i < nums.length; i++) { //Create random array
			nums[i] = rand.nextInt(100) + 1;
			System.out.println(nums[i]);
			counts[nums[i]] = counts[nums[i]] + 1;
		}
		
		for(int i = nums.length-1; i > -1; i--) {
			System.out.println(nums[i]);
		}
		
		for(int i = 0; i < counts.length; i++) { //keep track of recurrence of numbers
			System.out.println("The number " + i + " appeared " + counts[i] + " times");
		}
	}
}
