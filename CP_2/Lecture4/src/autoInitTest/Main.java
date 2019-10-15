package autoInitTest;

public class Main {

	public static void main(String[] args) {
		double[] a = new double[5]; // int는 0 / char은 null / double은 0.0 ...
		
		for(double element : a) {
			System.out.println(element);
		}
	}
}
