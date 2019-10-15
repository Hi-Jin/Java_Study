package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CompareSortings {
	
	public static void main(String[] args) {
		Scanner			input = new Scanner(System.in); // scanner
		int[] 			arr; // 난수 배열 원본
		int[] 			copiedArr; // 난수 배열 복사본
		// ranking[0] == bubble, 1 == selection, 2 == insertion, r == radix
		int				minRange, maxRange, num, trialNum; // 난수 생성 기준 및 테스트 횟수
		long			start, end;
		double			temp = 0.0, 
						bTime = 0.0, 
						sTime = 0.0, 
						iTime = 0.0, 
						rTime = 0.0, 
						aTime = 0.0;
		
		System.out.println("난수의 범위를 입력하세요.");
		System.out.print("최소 : 0\n");
		minRange = 0;
		System.out.print("최대 : ");
		maxRange = input.nextInt();
		
		System.out.print("\n난수의 개수를 입력하세요 : ");
		num = input.nextInt();
		arr = makeRandArr(num, minRange, maxRange);
		copiedArr = new int[arr.length];
		
		trialNum = 1;
		
		for(int count = 0; count < trialNum; count++) {
			System.arraycopy(arr, 0, copiedArr, 0, arr.length);
			start = System.nanoTime();
			BubbleSort.bubbleSort(copiedArr);
			end = System.nanoTime();
			temp = bTime * count;
			bTime = (end - start) / 1000000000.0 + temp;
			bTime /= (double) (count + 1);
			
			System.arraycopy(arr, 0, copiedArr, 0, arr.length);
			start = System.nanoTime();
			SelectionSort.selectionSort(copiedArr);
			end = System.nanoTime();
			temp = sTime * count;
			sTime = (end - start) / 1000000000.0 + temp;
			sTime /= (double) (count + 1);
			
			System.arraycopy(arr, 0, copiedArr, 0, arr.length);
			start = System.nanoTime();
			InsertionSort.insertionSort(copiedArr);
			end = System.nanoTime();
			temp = iTime * count;
			iTime = (end - start) / 1000000000.0 + temp;
			iTime /= (double) (count + 1);
			
			System.arraycopy(arr, 0, copiedArr, 0, arr.length);
			start = System.nanoTime();
			RadixSort.radixSort(copiedArr);
			end = System.nanoTime();
			temp = rTime * count;
			rTime = (end - start) / 1000000000.0 + temp;
			rTime /= (double) (count + 1);
			
			System.arraycopy(arr, 0, copiedArr, 0, arr.length);
			start = System.nanoTime();
			Arrays.sort(copiedArr);
			end = System.nanoTime();
			temp = aTime * count;
			aTime = (end - start) / 1000000000.0 + temp;
			aTime /= (double) (count + 1);
		}
		
		System.out.println("bubble sort : " + bTime + "초");
		System.out.println("selection sort : " + sTime + "초");
		System.out.println("insertion sort : " + iTime + "초");
		System.out.println("radix sort : " + rTime + "초");
		System.out.println("Arrays.sort : " + aTime + "초");
		
		double[] timeArr = {bTime, sTime, iTime, rTime, aTime};
		Arrays.sort(timeArr);
		
		System.out.println("\n" + minRange + " 부터 " + maxRange + " 까지의 수 " + num + "개를 "
				+ trialNum + "번 정렬시킨 결과.");
		for(int i = 0; i < 4; i++) {
			if(bTime == timeArr[i])
				System.out.print("bubbleSort, ");
			if(sTime == timeArr[i])
				System.out.print("selectionSort, ");
			if(iTime == timeArr[i])
				System.out.print("insertionSort, ");
			if(rTime == timeArr[i])
				System.out.print("radixSort, ");
			if(aTime == timeArr[i])
				System.out.print("Arrays.Sort, ");
		}
		if(bTime == timeArr[4])
			System.out.print("bubbleSort 순으로 빠릅니다.");
		if(sTime == timeArr[4])
			System.out.print("selectionSort 순으로 빠릅니다.");
		if(iTime == timeArr[4])
			System.out.print("insertionSort 순으로 빠릅니다.");
		if(rTime == timeArr[4])
			System.out.print("radixSort 순으로 빠릅니다.");
		if(aTime == timeArr[4])
			System.out.print("Arrays.Sort 순으로 빠릅니다.");
		
		System.out.println("\n\n\nsorting sorted arr // sorting reverse arr\n");
		System.out.println("sorting sorted arr-");

		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		Arrays.sort(copiedArr);
		start = System.nanoTime();
		BubbleSort.bubbleSort(copiedArr);
		end = System.nanoTime();
		bTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		Arrays.sort(copiedArr);
		start = System.nanoTime();
		SelectionSort.selectionSort(copiedArr);
		end = System.nanoTime();
		sTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		Arrays.sort(copiedArr);
		start = System.nanoTime();
		InsertionSort.insertionSort(copiedArr);
		end = System.nanoTime();
		iTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		Arrays.sort(copiedArr);
		start = System.nanoTime();
		RadixSort.radixSort(copiedArr);
		end = System.nanoTime();
		rTime = (end - start) / 1000000000.0;
		
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		Arrays.sort(copiedArr);
		start = System.nanoTime();
		Arrays.sort(copiedArr);
		end = System.nanoTime();
		aTime = (end - start) / 1000000000.0;
		
		System.out.println("bubble sort : " + bTime + "초");
		System.out.println("selection sort : " + sTime + "초");
		System.out.println("insertion sort : " + iTime + "초");
		System.out.println("radix sort : " + rTime + "초");
		System.out.println("Arrays.sort : " + aTime + "초");
		
		double[] timeArr2 = {bTime, sTime, iTime, rTime, aTime};
		
		Arrays.sort(timeArr2);
		
		for(int i = 0; i < 4; i++) {
			if(bTime == timeArr2[i])
				System.out.print("bubbleSort, ");
			if(sTime == timeArr2[i])
				System.out.print("selectionSort, ");
			if(iTime == timeArr2[i])
				System.out.print("insertionSort, ");
			if(rTime == timeArr2[i])
				System.out.print("radixSort, ");
			if(aTime == timeArr2[i])
				System.out.print("Arrays.Sort, ");
		}
		if(bTime == timeArr2[4])
			System.out.print("bubbleSort 순으로 빠릅니다.");
		if(sTime == timeArr2[4])
			System.out.print("selectionSort 순으로 빠릅니다.");
		if(iTime == timeArr2[4])
			System.out.print("insertionSort 순으로 빠릅니다.");
		if(rTime == timeArr2[4])
			System.out.print("radixSort 순으로 빠릅니다.");
		if(aTime == timeArr2[4])
			System.out.print("Arrays.Sort 순으로 빠릅니다.");
		
		
		for(int i = 0; i < num; i++) {
			arr[i] = num - i - 1;
		}

		System.out.println("\n\nsorting reverse arr-");
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
		
		System.out.println("bubble sort : " + bTime + "초");
		System.out.println("selection sort : " + sTime + "초");
		System.out.println("insertion sort : " + iTime + "초");
		System.out.println("radix sort : " + rTime + "초");
		System.out.println("Arrays.sort : " + aTime + "초");
		
		double[] timeArr3 = {bTime, sTime, iTime, rTime, aTime};
		
		Arrays.sort(timeArr3);
		
		for(int i = 0; i < 4; i++) {
			if(bTime == timeArr3[i])
				System.out.print("bubbleSort, ");
			if(sTime == timeArr3[i])
				System.out.print("selectionSort, ");
			if(iTime == timeArr3[i])
				System.out.print("insertionSort, ");
			if(rTime == timeArr3[i])
				System.out.print("radixSort, ");
			if(aTime == timeArr3[i])
				System.out.print("Arrays.Sort, ");
		}
		if(bTime == timeArr3[4])
			System.out.print("bubbleSort 순으로 빠릅니다.");
		if(sTime == timeArr3[4])
			System.out.print("selectionSort 순으로 빠릅니다.");
		if(iTime == timeArr3[4])
			System.out.print("insertionSort 순으로 빠릅니다.");
		if(rTime == timeArr3[4])
			System.out.print("radixSort 순으로 빠릅니다.");
		if(aTime == timeArr3[4])
			System.out.print("Arrays.Sort 순으로 빠릅니다.");
		
		input.close();
	}
	
	public static int[] makeRandArr(int n, int low, int high) {
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++) {
			result[i] = (int) (Math.random()*(high - low + 1) + low);
		}
		
		// System.out.println("Random Arr = " + Arrays.toString(result));
		
		return result;
	}
}
