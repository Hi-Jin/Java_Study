package recursiveFunction;

import java.util.Scanner;

public class Fibonacci {

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("피보나치 수열의 n번째 항을 계산합니다.");
				System.out.print("n 값을 입력하세요: ");
				int n = input.nextInt();
				
				input.close();

				long start = System.currentTimeMillis();
				System.out.println("반복문을 사용해서 계산한 F(" + n + ") = " + loopFibonacci(n));
				long end = System.currentTimeMillis();
				System.out.println("계산 시간: " + (end-start) / 1000.0 + "초");

				start = System.currentTimeMillis();
				System.out.println("재귀호출을 사용해서 계산한 F(" + n + ") = " + recursiveFibonacci(n));
				end = System.currentTimeMillis();
				System.out.println("계산 시간: " + (end-start) / 1000.0 + "초");
		}

		public static long loopFibonacci(int n) {
			/*
			 * fibonacci(n) => a == n-2 && b == n-1
			 */
				long a = 0L;
				long b = 1L;
				long temp;

				if(n == 0)
						return 0;
				else if(n == 1)
						return 1;
				else {
						for(int i = 2; i <= n; i++) {
								temp = a;
								a = b;
								b += temp;
						}
				}

				return b;
		}

		public static long recursiveFibonacci(int n) {
				if(n == 0)
						return 0L;
				else if(n == 1)
						return 1L;
				else
						return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		}
}