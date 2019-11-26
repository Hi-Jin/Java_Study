package lecture13.test;

public class FormatTest {

	public static void main(String[] args) {
		int i = 8;
		double r = Math.log(i);
		
		System.out.format("log(%d)은 %+020.10f입니다.%n", i, r);
	}
}
