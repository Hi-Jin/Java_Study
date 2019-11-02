package lab09.surveyGUI;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class SurveyController implements Initializable {

	@FXML TextField name;
	@FXML ComboBox<String> residence;
	@FXML ToggleGroup gender;
	@FXML CheckBox pref_spring;
	@FXML CheckBox pref_summer;
	@FXML CheckBox pref_fall;
	@FXML CheckBox pref_winter;
	@FXML ToggleGroup fall_area;
	@FXML TextArea resultField;
	
	@FXML public void printResult() {
		String result = "이름: " + name.getText().toString() + "\n";
		result += "성별: " + gender.getSelectedToggle().getUserData().toString() + "\n";
		result += "좋아하는 계절: " + (pref_spring.isSelected() ? pref_spring.getText().toString() : "");
		result += " " + (pref_summer.isSelected() ? pref_summer.getText().toString() : "");
		result += " " + (pref_fall.isSelected() ? pref_fall.getText().toString() : "");
		result += " " + (pref_winter.isSelected() ? pref_winter.getText().toString() : "");
		result += "\n여행하고 싶은 지역: " + fall_area.getSelectedToggle().getUserData().toString();
		
		resultField.setText(result);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ObservableList<String> residenceComboBox = FXCollections.observableArrayList("서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "세종특별자치시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도");
		residence.setItems(residenceComboBox);
	}

	
}
