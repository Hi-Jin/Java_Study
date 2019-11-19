package lab12.bank;

class CheckingAccount extends Account {
	private SavingsAccount s_account;

	private boolean savingflag;
	private double balance_line;
	
	public CheckingAccount(double balance) {
		super(balance);
		savingflag = false;
	}
	
	public CheckingAccount(double balance, SavingsAccount account) {	
		super(balance);
		s_account = account;
		savingflag = true;
	}
	
	public CheckingAccount(double balance, double b_line) {
		super(balance);
		balance_line = b_line;
	}
	
	public boolean withdraw(double amt) {
		if( getBalance() < amt ) {
			if(savingflag) {
				s_account.Balance = s_account.Balance + Balance - amt;
				Balance = 0;
				
				return true;
			}
			
			else {
				return false;
			}
		}
		
		else {
			Balance = Balance - amt;
		}
		
		return true;
	}	

	public String getAcctType() {
		return "Checkings";
	}
}
