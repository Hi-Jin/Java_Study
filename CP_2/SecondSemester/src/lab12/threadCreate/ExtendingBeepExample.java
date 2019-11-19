package lab12.threadCreate;

import java.awt.Toolkit;

public class ExtendingBeepExample {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}

class BeepThread extends Thread {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}
}