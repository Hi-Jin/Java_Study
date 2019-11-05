package lab10.rsp;

import java.util.HashMap;
import java.util.Map;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextArea;

public class RspController {

	@FXML ToggleGroup 	userData;
	@FXML ImageView 	Player_img;
	@FXML ImageView 	AI_img;
	@FXML TextArea 		resultField;
	
	private static Map<Integer, Integer> winWay;
	
	static {
		winWay = new HashMap<>();
		winWay.put(0, 1);
		winWay.put(1, 2);
		winWay.put(2, 0);
	}
	
//	왜 컴퓨터 img랑 사람 img랑 나누었는지 모르겠음.
	private Image[] rspImg = {
		new Image(getClass().getResource("images/com_rock.png").toString()), 
		new Image(getClass().getResource("images/com_scissors.png").toString()), 
		new Image(getClass().getResource("images/com_paper.png").toString())
	};
	
	@FXML public void showResult() {
		int comRsp = (int) (Math.random() * 3);
		int userRsp = Integer.parseInt(userData.getSelectedToggle().getUserData().toString());
		
		Player_img.setImage(rspImg[userRsp]);
		AI_img.setImage(rspImg[comRsp]);
		
		if(winWay.get(userRsp) == comRsp)
			resultField.setText("결과\nPlayer가 이겼습니다.");
		else if(userRsp == comRsp)
			resultField.setText("결과\n비겼습니다.");
		else
			resultField.setText("결과\nAI가 이겼습니다.");
	}
}
