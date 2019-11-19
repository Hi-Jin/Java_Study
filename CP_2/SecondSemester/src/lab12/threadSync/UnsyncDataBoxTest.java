package lab12.threadSync;

public class UnsyncDataBoxTest {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		Worker worker1 = new Worker("Worker1", 100);
		worker1.setDataBox(dataBox);
		worker1.start();
		
		Worker worker2 = new Worker("Worker2", 50);
		worker2.setDataBox(dataBox);
		worker2.start();
	}
}
