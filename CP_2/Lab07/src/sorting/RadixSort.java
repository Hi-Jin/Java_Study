package sorting;

import java.util.Arrays;

public class RadixSort {

	private static int[][] 	bucket;
	private static int[]	arraySize;
	private static int[] 	positive;
	private static int[]	negative;
	
	private static void addToBucket(int input, int digit) {
		digit = (input%(digit*10))/digit;
		bucket[digit][arraySize[digit]++] = input;
		// 오류 체크
		// System.out.println(arraySize[digit]);
	}
	
	private static void signClassification(int[] input) {
		int[] tempPositive = new int[input.length];
		int[] tempNegative = new int[input.length];
		int pSize = 0;
		int nSize = 0;
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] < 0)
				tempNegative[nSize++] = -1 * input[i];
			else
				tempPositive[pSize++] = input[i];
		}
		
		negative = new int[nSize];
		positive = new int[pSize];
		
		for(int i = 0; i < nSize; i++)
			negative[i] = tempNegative[i];
		for(int i = 0; i < pSize; i++)
			positive[i] = tempPositive[i];
		
		tempNegative = null;
		tempPositive = null;
	}
	
	public static int[] radixSort(int[] input) {
		signClassification(input);
		
		positive = sort(positive);
		negative = sort(negative);
		
		int[] result = new int[input.length];
		
		for(int i = 0; i < negative.length; i++) {
			result[i] = -1 * negative[negative.length - i - 1];
		}
		for(int i = 0; i < positive.length; i++) {
			result[negative.length + i] = positive[i];
		}
		
		System.out.println("Sorted Arr = " + Arrays.toString(result));
		
		return result;
	}
	
	private static int[] sort(int[] input) {
		bucket = new int[10][input.length];
		int max = 0;
		
		//get max
		for(int i = 0; i < input.length; i++) {
			max = (input[i] > max) ? input[i] : max;
		}
		
		int digit = 1;
		
		while(digit <= (int) Math.pow(10, Integer.toString(max).length())) {
			bucket = new int[10][input.length];
			arraySize = new int[10];
			for(int i = 0; i < input.length; i++) {
				addToBucket(input[i], digit);
				// 오류 체크
				// System.out.print("add");
			}
			digit *= 10;
			
			int point = 0;
			int count = 0;
			for(int i = 0; i < input.length; i++) {
				if(count >= arraySize[point]) {
					point++;
					count = 0;
					i--;
					continue;
				}
				// 오류 체크
				/*
				if(bucket[point][count] == 0) {
					System.out.println("point = " + point);
					System.out.println("count = " + count);
				}
				System.out.println(bucket[point][count]);
				*/
				input[i] = bucket[point][count++];
			}
		}

		// 오류 체크
		// System.out.println(Arrays.toString(bucket[0]));
		
		return bucket[0];
	}
}