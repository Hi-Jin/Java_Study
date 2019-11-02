package lab06.recursiveFunction;

import java.util.ArrayList;

public class BinarySearch {

	public static <T> int binarySearch(ArrayList<? extends Comparable<T>> list, T target, int begin, int end) {
		if(begin > end)
			return -1;
		
		int mid = (begin + end) / 2;
		if(list.get(mid).compareTo(target) == 0)
			return mid;
		else if(list.get(mid).compareTo(target) < 0)
			return binarySearch(list, target, mid + 1, end);
		else
			return binarySearch(list, target, begin, mid - 1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; i++)
			list.add(2*i);
		
		System.out.println("이진 탐색으로 150 탐색: " + binarySearch(list, 150, 0, list.size()-1));
		System.out.println("list.get(75): " + list.get(75));
		System.out.println("이진 탐색으로 111 탐색: " + binarySearch(list, 111, 0, list.size()-1));
	}
}
