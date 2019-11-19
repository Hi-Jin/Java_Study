package lab12.threadCreate;

import java.awt.Toolkit;

public class LambdaBeepExample {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
		});
		
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
