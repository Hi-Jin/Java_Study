package lab12.threadSync;

public class DataBox {

	private int data;
	
	public int getData() {
		return data;
	}
	
	public synchronized void setData(int data) {
		this.data = data;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.data);
	}
}
