package lab12.bank;

import java.io.Serializable;

public class Bank implements Serializable {
	Customer[] customer;
	private int numOfCustomer;
	// private Lock bankLock;

	public Bank(int ncus) {
		customer = new Customer[ncus];
		numOfCustomer = 0;
		// bankLock = new ReentrantLock();
	}

	public void addCustomer(String name) {
		customer[numOfCustomer] = new Customer(name);
		numOfCustomer++;
	}

	public int getNumofCustomers() {
		return numOfCustomer;
	}

	public Customer getCustomer(int index) {
		return customer[index];
	}

	public synchronized void transfer(int from, int to, double amount) {
		double balanceOfCustomer = 0;
		for(int i = 0; i < customer[from].getNumOfAccounts(); i++) {
			balanceOfCustomer += customer[from].getAccount(i).getBalance();
		}
		if(amount > balanceOfCustomer) {
			try {
				wait();
			} catch (InterruptedException e) {}
			transfer(from, to, amount);
		} else {
			customer[from].getAccount(0).withdraw((int) amount);
			customer[to].getAccount(0).deposit((int) amount);
			notifyAll();
			System.out.print("CNU" + from + "계좌에서 CNU" + to + "계좌로 " + (int) amount + "원을 송금, ");
			System.out.println(String.format("은행의 보유 금액: %,d",(int) getTotalBalance()));
		}
	}

	public double getTotalBalance() {
		double totalBalance = 0.0;
		
		for(int i = 0; i < customer.length; i++) {
			totalBalance += customer[i].getAccount(0).getBalance();
		}
		return totalBalance;
	}
}
