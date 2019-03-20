
public class Account implements Lockable{
	private static int baseNum = 100000000;
	private int number;
	private double balance;
	private int key;
	private boolean locked;
	
	public Account() {
		this.number = baseNum++;
		this.balance = 0;
		this.key = 0;
		this.locked = false;
	}
	
	public Account(double balance) {
		this.number = baseNum++;
		this.balance = balance;
		this.key = 0;
		this.locked = false;
	}
	
	public void deposit(double amount) {
		if(amount > 0 && !this.isLocked()) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance && !this.isLocked()) {
			balance -= amount;
		}
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Interface methods
	 */
	public void setKey(int key) {
		this.key = key;
	}
	
	public void lock(int key) {
		if(this.key == key) {
			locked = true;
		}
	}
	
	public void unlock(int key) {
		if(this.key == key) {
			locked = false;
		}
	}
	
	public boolean isLocked() {
		return locked;
	}
}
