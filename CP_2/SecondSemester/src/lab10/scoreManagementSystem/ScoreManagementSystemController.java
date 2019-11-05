package lab10.scoreManagementSystem;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ScoreManagementSystemController {

	@FXML TableView<ScoreModel> 			scoreTableView;
	@FXML TableColumn<ScoreModel, String> 	nameColumn;
	@FXML TableColumn<ScoreModel, Integer> 	midtermColumn;
	@FXML TableColumn<ScoreModel, Integer> 	finalColumn;
	@FXML TableColumn<ScoreModel, Integer> 	hwColumn;
	@FXML TableColumn<ScoreModel, Integer> 	etcColumn;
	@FXML TableColumn<ScoreModel, Integer> 	sumColumn;
	
	@FXML TextField nameField;
	@FXML TextField midtermField;
	@FXML TextField finalField;
	@FXML TextField hwField;
	@FXML TextField etcField;
	
	private ObservableList<ScoreModel> scoreList;
	
	@FXML public void registerAction() {}

}
