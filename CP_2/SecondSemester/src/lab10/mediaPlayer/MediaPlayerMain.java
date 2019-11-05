package lab10.mediaPlayer;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MediaPlayerMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MediaPlayer.fxml"))));
			primaryStage.setTitle("JavaFX 미디어 플레이어");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
