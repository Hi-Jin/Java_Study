package lecture02.limitedType;

public class Array {

	public static <T extends Comparable<T>> T getMax(T[] a) {
		if(a == null || a.length == 0)
			return null;
		T largest = a[0];
		for(int i = 1; i < a.length; i++) {
			if(largest.compareTo(a[i]) > 0)
				largest = a[i];
		}
		return largest;
	}
}
