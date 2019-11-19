package lab11.currentTime;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CurrentTimeMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("CurrentTime.fxml"))));
			primaryStage.setTitle("현재시각");
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
