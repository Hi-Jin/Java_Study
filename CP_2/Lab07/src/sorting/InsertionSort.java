package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		int temp, j;
		
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			for (j = i; j > 0 && arr[j-1] > temp; j--)
				arr[j] = arr[j-1];
			arr[j] = temp;
		}
		
		System.out.println("Sorted Arr = " + Arrays.toString(arr));
		
		return arr;
	}
}
