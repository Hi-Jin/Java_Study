package lab12.bank;

import java.io.Serializable;

public abstract class Account implements Serializable {
	public abstract String getAcctType();
	public Account(double init_balance) {
		Balance = init_balance;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	public boolean deposit(double amt) {
		Balance = Balance + amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		Balance = Balance - amt;
		return true;
	}
	
	protected double Balance;
}
