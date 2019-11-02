package lab02.genericBoxingAndCompare;

import lab02.multiType.Pair;

public class Utility {

	public static <T> GenericBox<T> boxing(T data) {
		GenericBox<T> box = new GenericBox<>();
		box.set(data);
		return box;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p2.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <T extends Comparable<T>> T getMax(T[] array) {
		if (array == null || array.length == 0)
			return null;
		T largest = array[0];
		for (int i = 0; i < array.length; i++)
			if (largest.compareTo(array[i]) < 0)
				largest = array[i];
		return largest;
	}
}
