package lab10.toEatList;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ToEatListMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ToEatList.fxml"))));
			primaryStage.setTitle("먹어야 할 음식");
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
