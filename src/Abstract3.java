
public class Abstract3 extends IComboLock {

	@Override
	public void setcombo(int num1, int num2, int num3) {
		combo = new int[3];
		combo[0] = num1;
		combo[1] = num2;
		combo[2] = num3;
	}

	@Override
	public void unlock(int num1, int num2, int num3) {
		if(num1 == combo[0] && num2 == combo[1] && num3 == combo[2]) {
			locked = false;
			System.out.println("Successfully unlocked");
		}
		else {
			System.out.println("Failed to unlock. Incorrect combination");
		}
		
	}

}
