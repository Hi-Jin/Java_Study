package lab11.transitionExample;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TransitionExampleMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("화면이동과 애니메이션");
			primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Main.fxml"))));
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
