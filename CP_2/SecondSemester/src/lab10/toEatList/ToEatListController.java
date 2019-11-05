package lab10.toEatList;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

//initialize와 property, predicate 등에 관해 영상을 시청한 후 다시 분석하기
public class ToEatListController implements Initializable {

	@FXML TextField 		searchField;
	@FXML ListView<String> 	foodListView;
	@FXML TextField 		inputField;
	@FXML Button 			insertButton;
	
	private ObservableList<String> 	foodList;
	private FilteredList<String> 	filteredList;
	
//	뭔지 모르겠다.
	@FXML public void searchAction() {
		filteredList.setPredicate(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				if (t.contains(searchField.getText()))
					return true;
				return false;
			}
		});
		
		foodListView.setItems(filteredList);
	}
	
	@FXML public void insertAction() {
		foodList.add(inputField.getText());
		inputField.setText("");
		inputField.requestFocus();
	}
	
	@FXML public void deleteAction() {
		int selectedIndex = foodListView.getSelectionModel().getSelectedIndex();
		if(selectedIndex < 0) {
			new Alert(Alert.AlertType.WARNING, "삭제할 항목을 선택하세요.", ButtonType.CLOSE).show();
			return;
		}
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "정말 삭제하시겠습니까?", ButtonType.OK, ButtonType.CANCEL);
		Optional<ButtonType> result = alert.showAndWait();
		if(result.get() == ButtonType.OK)
			foodList.remove(selectedIndex);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		foodList = FXCollections.observableArrayList();
		foodListView.setItems(foodList);
		filteredList = new FilteredList<>(foodList);
		
//		뭔지 모르겠다.
		inputField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(!oldValue.contentEquals(newValue) && newValue.length() > 0)
					insertButton.setDisable(false);
				if(newValue.length() == 0)
					insertButton.setDisable(true);
			}
		});
	}

}
