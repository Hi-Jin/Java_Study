package recursiveFunction;

import java.util.ArrayList;

public class LoopBinarySearch {
	
	public static <T> int binarySearch(ArrayList<? extends Comparable<T>> list, T target, int begin, int end) {
		int mid = (begin + end) / 2;
		
		while(list.get(mid).compareTo(target) != 0) {			
			if(begin > end) return -1;
			
			if(list.get(mid).compareTo(target) < 0)
				begin = mid + 1;
			else
				end = mid - 1;
			mid = (begin + end) / 2;
		}
		
		return mid;
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
