package lab11.loginForm;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController {

	@FXML AnchorPane loginPane;

	@FXML public void moveToMain() {
		StackPane root = (StackPane) loginPane.getScene().getRoot();
		loginPane.setTranslateX(0);
		
		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(loginPane.translateXProperty(), loginPane.getWidth());
		KeyFrame keyFrame = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				root.getChildren().remove(loginPane);
			}
		}, keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}
	
}
