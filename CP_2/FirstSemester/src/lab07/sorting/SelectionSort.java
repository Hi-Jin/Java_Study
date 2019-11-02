package lab07.sorting;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		int max;
		
		for(int i = arr.length - 1; i > 0; i--) {
			max = 0; // max element's index
			for(int j = 1; j <= i; j++) {
				max = arr[j] > arr[max] ? j : max;
			}
			MyArray.swap(arr, i, max);
		}
		
		return arr;
	}
}
