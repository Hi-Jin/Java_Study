package lab11.currentTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CurrentTimeController {
	@FXML Label 	timeLabel;
	@FXML Button 	startButton;
	private boolean isStopped;
	@FXML public void startAction() {
		this.isStopped = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
				while(!isStopped) {
					String strTime = format.format(new Date());
					Platform.runLater(() -> timeLabel.setText(strTime));
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
	}
	@FXML public void stopAction() {
		this.isStopped = true;
	}
}
