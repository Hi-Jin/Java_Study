package lab13.objectStreamTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lab12.bank.*;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		Bank bank = new Bank(100);
		for(int i = 0; i < 100; i++) {
			bank.addCustomer("CNU" + i);
			bank.getCustomer(i).addAccount(new CheckingAccount(1000.0));
		}
		
		System.out.println("은행의 고객의 잔고 보유 현황");
		for(int i = 0; i < bank.getNumofCustomers(); i++) {
			Customer customer = bank.getCustomer(i);
			Account acc = customer.getAccount(0);
			System.out.println(customer.getName() + "의 보유금액" + acc.getBalance() + "원");
		}
		
		System.out.println("은행의 총 고객 수: " + bank.getNumofCustomers() + "명");
		System.out.println("은행의 총 잔고: " + bank.getTotalBalance() + "원");
		
		ObjectOutputStream oos = null;
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("./src/lab13/objectStreamTest/Bank.obj");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			oos.writeObject(bank);
			oos.flush();
			oos.close();
			System.out.println("객체 저장 완료");
		} catch(IOException e) {
			System.out.println("입출력 오류 발생");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 오류 발생");
		}
	}
}
