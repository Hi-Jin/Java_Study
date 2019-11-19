package lab11.stopWatch;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.util.Duration;
import javafx.scene.control.TableColumn;

public class StopWatchController implements Initializable {
	
	
	@FXML Label 	timeLabel;
	@FXML Button 	startBtn;
	@FXML Button 	clearBtn;
	@FXML Label 	lapTimeLabel;
	@FXML TableView<TimeModel> 				timeTable;
	@FXML TableColumn<TimeModel, String> 	noColumn;
	@FXML TableColumn<TimeModel, String> 	lapTimeColumn;
	@FXML TableColumn<TimeModel, String> 	totalColumn;
	
	ObservableList<TimeModel> myList = FXCollections.observableArrayList();
	
	private long totalTime = 0;
	private long currentLapTime = totalTime;
	private long lastLapTime = totalTime;
	private boolean isStopped = true;
	private int no = 1;
	private Timeline timeline;
	
	@FXML public void start() {
		if(isStopped) {
			timeline.play();
			isStopped = false;
			startBtn.setText("일시정지");
			clearBtn.setText("랩타임");
			clearBtn.setDisable(false);
		} else {
			timeline.pause();
			isStopped = true;
			startBtn.setText("시작");
			clearBtn.setText("초기화");
		}
	}

	@FXML public void clear() {
		if(isStopped) {
			myList.clear();
			no = 1;
			totalTime = 0;
			currentLapTime = totalTime;
			lastLapTime = totalTime;
			timeLabel.setText("00:00:00.000");
			lapTimeLabel.setText("00:00:00.000");
		} else {
			currentLapTime = totalTime - lastLapTime;
			lastLapTime = totalTime;
			myList.add(new TimeModel(new SimpleStringProperty(Integer.toString(no++)), new SimpleStringProperty(millisecondsToTime(currentLapTime)), new SimpleStringProperty(millisecondsToTime(totalTime))));
			timeTable.scrollTo(myList.size());
			currentLapTime = 0;
		}
	}
	
	private String millisecondsToTime(long milliseconds) {
		int h = 0, m = 0, s = 0, ms = 0;
		
		ms = (int) (milliseconds % 1000);
		milliseconds /= 1000;
		
		s = (int) (milliseconds % 60);
		milliseconds /= 60;
		
		m = (int) (milliseconds % 60);
		milliseconds /= 60;
		
		h = (int) milliseconds;
		
		return String.format("%02d:%02d:%02d.%03d", h, m, s, ms);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		clearBtn.setDisable(true);
		noColumn.setCellValueFactory(cellData -> cellData.getValue().noProperty());
		lapTimeColumn.setCellValueFactory(cellData -> cellData.getValue().lapTimeProperty());
		totalColumn.setCellValueFactory(cellData -> cellData.getValue().totalProperty());
		timeTable.setItems(myList);
		timeTable.setPlaceholder(new Label("랩 데이터가 없음"));
		
		KeyFrame keyFrame = new KeyFrame(Duration.ONE, event -> {
			timeLabel.setText(millisecondsToTime(totalTime));
			lapTimeLabel.setText(millisecondsToTime(currentLapTime));
			++totalTime;
			++currentLapTime;
		});
		timeline = new Timeline(keyFrame);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(false);
	}
}
