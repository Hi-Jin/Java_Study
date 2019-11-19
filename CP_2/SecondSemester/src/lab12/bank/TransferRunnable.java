package lab12.bank;

public class TransferRunnable implements Runnable {

	Bank bank;
	int fromAccount;
	double maxAmount;
	final int DELAY = 10;
	
	public TransferRunnable(Bank bank, int fromAccount, double maxAmount) {
		this.bank = bank;
		this.fromAccount = fromAccount;
		this.maxAmount = maxAmount;
	}

	@Override
	public void run() {
		int toAccount;
		double amount;
//		to-do
		int delay;
		
		while(true) {
			toAccount = (int) (Math.random() * SynchBankTest.NCUSTOMERS);
			amount = (double) (Math.random() * maxAmount);
			delay = (int) (Math.random() * DELAY);
			
			bank.transfer(fromAccount, toAccount, amount);
			try {
				Thread.sleep(delay);
			} catch(InterruptedException e) {}
		}
	}	
}
