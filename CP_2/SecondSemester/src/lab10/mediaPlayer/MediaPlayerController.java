package lab10.mediaPlayer;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class MediaPlayerController implements Initializable {

	@FXML MediaView 	mediaView;
	@FXML ProgressBar 	progressBar;
	@FXML Label 		timeLabel;
	@FXML Slider 		volumeSlider;
	
	private MediaPlayer player;
	
	@FXML public void playAction() {
		player.play();
	}
	
	@FXML public void pauseAction() {
		player.pause();
	}
	
	@FXML public void stopAction() {
		player.stop();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Path path = Paths.get("src/lab10/mediaPlayer/movie.mp4");
		Media media = new Media(path.toUri().toString());
		player = new MediaPlayer(media);
		mediaView.setMediaPlayer(player);
		
		player.setOnReady(new Runnable() {
			@Override
			public void run() {
				player.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						double currentTime = player.getCurrentTime().toSeconds();
						double totalTime = player.getTotalDuration().toSeconds();
						double progress = currentTime / totalTime;
						progressBar.setProgress(progress);
						timeLabel.setText((int) currentTime + "/" + (int) totalTime + "초");
					}
				});
			}
			
		});
		volumeSlider.setValue(100.0);
		player.setVolume(volumeSlider.getValue());
		volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				player.setVolume(newValue.doubleValue() / 100.0);
			}
		});
	}

}
