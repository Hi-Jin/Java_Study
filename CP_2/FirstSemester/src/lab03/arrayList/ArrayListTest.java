package lab03.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");
		list.set(2, "GRAPE");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
