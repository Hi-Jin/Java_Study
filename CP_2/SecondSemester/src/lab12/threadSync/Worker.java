package lab12.threadSync;

public class Worker extends Thread {

	private DataBox dataBox;
	private int workerData;
	
	public Worker(String workerName, int workerData) {
		this.setName(workerName);
		this.workerData = workerData;
	}
	
	public void setDataBox(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	public void run() {
		dataBox.setData(workerData);
	}
}
