package lab13.objectStreamTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import lab12.bank.*;

public class ObjectInputStreamTest {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		Bank bank = null;
		try {
			fis = new FileInputStream("./src/lab13/objectStreamTest/Bank.obj");
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			bank = (Bank) ois.readObject();
			
			fis.close();
			bis.close();
			ois.close();
		} catch(IOException e) {
			System.out.println("입출력 오류 발생");
		} catch(ClassNotFoundException e) {
			System.out.println("Bank 클래스를 찾을 수 없습니다.");
		}
		
		System.out.println("은행의 고객의 잔고 보유 현황");
		for(int i = 0; i < bank.getNumofCustomers(); i++) {
			Customer customer = bank.getCustomer(i);
			Account acc = customer.getAccount(0);
			System.out.println(customer.getName() + "의 보유 금액" + acc.getBalance() + "원");
		}
		
		System.out.println("은행의 총 고객 수: " + bank.getNumofCustomers() + "명");
		System.out.println("은행의 총 잔고: " + bank.getTotalBalance() + "원");
	}
}
