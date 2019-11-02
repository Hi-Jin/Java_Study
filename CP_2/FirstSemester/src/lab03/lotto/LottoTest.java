package lab03.lotto;

public class LottoTest {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Lotto myLotto = new Lotto();
		myLotto.drawAgain();
		lotto.drawAgain();
		System.out.println("당첨번호: " + lotto.getWinNumbers());
		
		int count;
		int allCount = 0;
		
		while(true) {
			count = 0;
			myLotto.drawAgain();
			System.out.println("내번호: " + myLotto.getWinNumbers());
			System.out.println("총 시도횟수: " + allCount);
			while(true) {
				count++;
				allCount++;
				lotto.drawAgain();
				if(myLotto.getWinNumbers().equals(lotto.getWinNumbers())) break;
			}
			if (count < 1000) break;
		}
		System.out.println(count + "번 만에 당첨되었습니다.");
		System.out.println("내번호: " + myLotto.getWinNumbers());
		System.out.println("당첨번호: " + lotto.getWinNumbers());
		System.out.println("총 시도횟수: " + allCount);
	}
}
