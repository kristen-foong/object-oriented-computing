
public class Account {
	private static int baseNum = 1000000;
	private int accNum;
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
		this.accNum = baseNum;
		baseNum++;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		}
	}
	
	public double withdraw(double amount) {
		if(this.balance >= amount && amount > 0) {
			this.balance -= amount;
		}
		return amount;
	}
	
	public boolean transfer(Account a,double amount) {
		if(this.balance >= amount) {
			double trans = this.withdraw(amount);
			a.deposit(trans);
			return true;
		}else {
			return false;
		}
	}
}
