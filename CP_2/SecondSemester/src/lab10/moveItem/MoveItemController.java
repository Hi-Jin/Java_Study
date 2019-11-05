package lab10.moveItem;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MoveItemController implements Initializable {

	@FXML ListView<String> 	leftList;
	@FXML ListView<String> 	rightList;
	@FXML TextField 		addField;
	
	private ObservableList<String> leftItem;
	private ObservableList<String> rightItem;
	
	@FXML public void moveRight() {
		int selectedIndex = leftList.getSelectionModel().getSelectedIndex();
		if(selectedIndex < 0) {
			new Alert(Alert.AlertType.WARNING, "이동할 항목을 선택하세요.", ButtonType.CLOSE).show();
			return;
		}
		rightItem.add(leftItem.remove(selectedIndex));
	}
	
	@FXML public void moveLeft() {
		int selectedIndex = rightList.getSelectionModel().getSelectedIndex();
		if(selectedIndex < 0) {
			new Alert(Alert.AlertType.WARNING, "이동할 항목을 선택하세요.", ButtonType.CLOSE).show();
			return;
		}
		leftItem.add(rightItem.remove(selectedIndex));
	}
	
	@FXML public void moveRightAll() {
		rightItem.addAll(leftItem);
		leftItem.clear();
	}
	
	@FXML public void moveLeftAll() {
		leftItem.addAll(rightItem);
		rightItem.clear();
	}
	
	@FXML public void addToList() {
		if(addField.getText().length() > 0) {
			leftItem.add(addField.getText());
			addField.setText("");
			addField.requestFocus();
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		leftItem = FXCollections.observableArrayList();
		rightItem = FXCollections.observableArrayList();
		
		leftList.setItems(leftItem);
		rightList.setItems(rightItem);
	}

}
