package lab12.bank;

public class Customer {
	Account[] account;

	public Customer(String name) {
		this.name = name;
		index = 0;
		account = new Account[50];
	}

	public void addAccount(Account acct) {
		account[index] = acct;
		index++;
	}

	public Account getAccount(int index) {
		return account[index];
	}

	public int getNumOfAccounts() {
		return index;
	}

	public String getName() {
		return name;
	}

	private int index;
	private String name;
}
