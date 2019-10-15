package sorting;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					MyArray.swap(arr, j, j + 1);
				}
			}
		}
		
		return arr;
	}
}
