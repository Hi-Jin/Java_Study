package lab07.sorting;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		int temp, j;
		
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i; j > 0 && arr[j-1] > temp; j--)
				arr[j] = arr[j-1];
			arr[j] = temp;
		}
		
		return arr;
	}
}
