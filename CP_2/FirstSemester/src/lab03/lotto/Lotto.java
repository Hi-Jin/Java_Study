package lab03.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lotto {

	private LinkedList<Integer> lottoBalls;
	private ArrayList<Integer> winNumbers;
	
	public Lotto() {
		initLottoBalls();
		shuffleLottoBalls();
		drawLots();
	}
	
	private void initLottoBalls() {
		this.lottoBalls = new LinkedList<>();
		for(int i = 1; i <= 45; i++) {
			lottoBalls.add(i);
		}
	}
	
	private void shuffleLottoBalls() {
		Collections.shuffle(this.lottoBalls);
	}
	
	private void drawLots() {
		this.winNumbers = new ArrayList<>(6);
		for(int i = 0; i < 6; i++) {
			this.winNumbers.add(this.lottoBalls.get(i));
		}
	}
	
	public ArrayList<Integer> getWinNumbers() {
		Collections.sort(this.winNumbers);
		return this.winNumbers;
	}
	
	public void drawAgain() {
		shuffleLottoBalls();
		drawLots();
		Collections.sort(this.winNumbers);
	}
}
