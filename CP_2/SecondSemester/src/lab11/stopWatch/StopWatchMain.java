package lab11.stopWatch;

import java.io.IOException;
import java.util.logging.LogManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StopWatchMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("StopWatch.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("StopWatch.css").toExternalForm());
			primaryStage.setTitle("스톱 워치");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
//		scrollTo() method의 경고문 때문에 추가했습니다.
		LogManager.getLogManager().reset();
		
		launch(args);
	}
}
