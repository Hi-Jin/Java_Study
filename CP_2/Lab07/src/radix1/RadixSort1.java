package radix1;

import java.util.*;


public class RadixSort1 {
	public static void radixSort(int[] arr) {
		int maxsize = getMaxlength(arr);
		ArrayList<Queue<Integer>> bucket = new ArrayList<>();
		int powed = 1;
		int index = 0;

		for (int i = 0; i < 10; i++) { // ��Ŷ ����
			bucket.add(new LinkedList<>()); // ť�� ��ũ�� ����Ʈ�� �����Ǿ��ִ�.
		}
		for (int i = 1; i <= maxsize; i++) { // �ڸ����� ���� ū ����ŭ ��ü �ݺ����� �ݺ�.
			for (int j = 0; j < arr.length; j++) {
				bucket.get((arr[j] / powed) % 10).add(arr[j]); // �� �ڸ����� �´� index�� bucket�� �����͸� ����.
			}
			for (int k = 0; k < 10; k++) { // ��Ŷ���� �����͸� ������ɴϴ�.
				int bucket_num = bucket.get(k).size();
				for (int n = 0; n < bucket_num; n++) {
					arr[index] = bucket.get(k).poll();
					index++;
				}
			}
			index = 0;
			powed *= 10; 
		}
	}

	public static int getMaxlength(int[] data) {
		int maxsize = 0;
		for (int i = 0; i < data.length; i++) {
			int length = (int) Math.log10((double) data[i]) + 1;
			if (maxsize < length) {
				maxsize = length;
			}
		}
		return maxsize; // ���� ū �ڸ����� ��ȯ�մϴ�.
	}

	public static void main(String[] args) {
		int[] arr1 = new int[1000000];
		int[] arr2 = new int[1000000];
		for (int i = arr1.length-1; i >= 0; i--) {
			arr1[i] = (int) (Math.random() * 100000 + 1);
		}
		System.arraycopy(arr1, 0, arr2, 0, arr1.length - 1);

		long start = System.currentTimeMillis();
		radixSort(arr1);
		long end = System.currentTimeMillis();
		System.out.println("radix sort: " +(end - start)/1000.0	+"��");
		/*
		start = System.currentTimeMillis();
		SelectionSort.selectionSort(arr2);
		end = System.currentTimeMillis();
		System.out.println("selection sort: " +(end - start)/1000.0	+"��");*/
	}
	
}
