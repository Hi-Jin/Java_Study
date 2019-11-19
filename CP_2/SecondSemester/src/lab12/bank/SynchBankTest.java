package lab12.bank;

public class SynchBankTest {

	public static final int NCUSTOMERS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static int count = 0;
	
	public static void main(String[] args) {
		Bank bank = new Bank(NCUSTOMERS);
		TransferRunnable[] transferThreads = new TransferRunnable[NCUSTOMERS];
		for(int customerNumber = 0; customerNumber < NCUSTOMERS; customerNumber++) {
			bank.addCustomer("CNU" + Integer.toString(count++));
			bank.customer[count - 1].addAccount(new CheckingAccount(INITIAL_BALANCE));
			transferThreads[count - 1] = new TransferRunnable(bank, count - 1, INITIAL_BALANCE);
		}
		for(int i = 0; i < NCUSTOMERS; i++) {
			(new Thread(transferThreads[i])).start();
		}
	}
}
