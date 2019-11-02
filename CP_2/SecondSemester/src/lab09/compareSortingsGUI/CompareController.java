package lab09.compareSortingsGUI;

import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import lab07.sorting.BubbleSort;
import lab07.sorting.CompareSortings;
import lab07.sorting.InsertionSort;
import lab07.sorting.RadixSort;
import lab07.sorting.SelectionSort;

public class CompareController {
	
	@FXML TextField numberOfRand;
	@FXML TextField min;
	@FXML TextField max;
	@FXML TextArea randTextField;
	@FXML TextArea sortedTextField;
	@FXML TextArea reverseTextField;
	@FXML public void submit() {
		int[] arr = CompareSortings.makeRandArr(Integer.parseInt(numberOfRand.getText()), 
				Integer.parseInt(min.getText()), Integer.parseInt(max.getText()));
		randTextField.setText(compare(arr));
		
		Arrays.sort(arr);
		sortedTextField.setText(compare(arr));
		
		for(int i = Integer.parseInt(numberOfRand.getText()); i > 0; i--)
			arr[Integer.parseInt(numberOfRand.getText()) - i] = i;
		reverseTextField.setText(compare(arr));
		
	}
	
	private static String compare(int[] arr) {
		int[] 	copiedArr; // 배열 복사본
		long	start, end;
		double	bTime = 0.0, 
				sTime = 0.0, 
				iTime = 0.0, 
				rTime = 0.0, 
				aTime = 0.0;
		
		copiedArr = new int[arr.length];
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		start = System.nanoTime();
		BubbleSort.bubbleSort(copiedArr);
		end = System.nanoTime();
		bTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		start = System.nanoTime();
		SelectionSort.selectionSort(copiedArr);
		end = System.nanoTime();
		sTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		start = System.nanoTime();
		InsertionSort.insertionSort(copiedArr);
		end = System.nanoTime();
		iTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		start = System.nanoTime();
		RadixSort.radixSort(copiedArr);
		end = System.nanoTime();
		rTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		start = System.nanoTime();
		Arrays.sort(copiedArr);
		end = System.nanoTime();
		aTime = (end - start) / 1000000000.0;
		
		return "Bubble sort : " + bTime + "초\n" + "Selection sort : " + sTime + "초\n" + 
			"Insertion sort : " + iTime + "초\n" + "Radix sort : " + rTime + "초\n" + 
			"Arrays.sort : " + aTime + "초";
	}

}
