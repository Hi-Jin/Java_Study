package lotto;

public class LottoTest {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println("당첨번호: " + lotto.getWinNumbers());
		lotto.drawAgain();
		System.out.println("당첨번호: " + lotto.getWinNumbers());
	}
}
