package lab06.recursiveFunction;

public class RecursiveFunction {

	public static void main(String[] args) {
			System.out.println("10! = " + factorial(10));
			System.out.println("pi^3 = " + power(Math.PI, 3));
			System.out.println(reverseStr("programming with java"));
			int[] arr = {1, 3, 4, 5, 3, 2, 1, 10, 7};
			System.out.println("maxArr: " + maxArr(arr, 0, arr.length - 1));
	}

	public static int factorial(int n) {
			if(n == 0)
					return 1;
			else
					return n * factorial(n - 1);
	}

	public static double power(double num, int exp) {
			if(exp == 0)
					return 1.0;
			else
					return num * power(num, exp - 1);
	}

	public static int maxArr(int[] arr, int begin, int end) {
			if(begin >= end)
					return arr[begin];
			else {
					int max = maxArr(arr, begin + 1, end);
					if(arr[begin] >= max)
							return arr[begin];
					else
							return max;
			}
	}

	public static String reverseStr(String str) {
			if(str.length() == 1)
					return "" + str.charAt(0);
			else
					return reverseStr(str.substring(1)) + str.charAt(0);
	}
}