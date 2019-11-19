package lab12.producerAndConsumer;

public class Consumer implements Runnable {

	private DataBox dataBox;
	
	public Consumer(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
		}
	}

}
