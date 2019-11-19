package lab12.bank;

public class SavingsAccount extends Account {
	private double interested_rate;
	public SavingsAccount(double balance, double i_rate) {
		super(balance);
		interested_rate = i_rate;
	}	

	public String getAcctType() {
		return "Savings";
	}
}
