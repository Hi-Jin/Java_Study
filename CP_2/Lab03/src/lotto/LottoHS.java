package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LottoHS {

	private HashSet<Integer> winNumberSet;
	
	public LottoHS() {
		drawAgain();
	}
	
	public void drawAgain() {
		this.winNumberSet = new HashSet<Integer>();
		int lucky_number;
		while (winNumberSet.size() < 6) {
			lucky_number = (int) (Math.random() * 45.0) + 1;
			winNumberSet.add(lucky_number);
		}
	}
	
	public ArrayList<Integer> getWinNumbers() {
		ArrayList<Integer> winNumberList = new ArrayList<Integer>(this.winNumberSet);
		Collections.sort(winNumberList);
		
		return winNumberList;
	}
}
