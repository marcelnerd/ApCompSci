public abstract class IComboLock {
	public boolean locked;
	public int[] combo;
	
	abstract public void setcombo(int num1, int num2, int num3);
	
	public boolean isLocked() {
		return locked;
	}
	
	abstract public void unlock(int num1, int num2, int num3);
	
	public void lock() {
		locked = true;
	}
}
