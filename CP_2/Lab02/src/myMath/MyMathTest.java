package myMath;

public class MyMathTest {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5, 6};
		MyMath<Integer> imath = new MyMath<Integer>();
		System.out.println("Average of Integer array = " + imath.getAverage(intArray));
		
		Double[] dArray = {1.0, 3.0, 5.0, 7.0, 9.0, 11.0};
		MyMath<Double> dmath = new MyMath<>();
		System.out.println("Average of Double array = " + dmath.getAverage(dArray));
	}
}
