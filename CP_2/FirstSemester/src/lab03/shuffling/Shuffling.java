package lab03.shuffling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffling {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
	}
}
