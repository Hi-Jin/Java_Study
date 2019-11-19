package lab11.transitionExample;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class MainController {

	@FXML StackPane stackPane;

	@FXML public void moveToLogin() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/lab11/loginForm/LoginForm.fxml"));
			stackPane.getChildren().add(login);
			
			login.setTranslateX(login.getLayoutX()+300);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(500), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
