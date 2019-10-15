package hanoi;

public class TowerOfHanoi {

	public static void main(String[] args) {
		showMoves(3, 'A', 'B', 'C');
	}
	
	static void showMoves(int n, char from, char by, char to) {
		if(n == 1)
			System.out.println("디스크1 - " + from + "에서 " + to + "으로 이동");
		else {
			showMoves(n-1, from, to, by);
			System.out.println("디스크" + n + " - " + from + "에서 " + to + "로 이동");
			showMoves(n-1, by, from, to);
		}
		/*
		if(n > 0) {
			showMoves(n-1, from, to, by);
			System.out.println("디스크" + n + " - " + from + "에서 " + to + "로 이동");
			showMoves(n-1, by, from, to);
		}
		*/
	}
}
