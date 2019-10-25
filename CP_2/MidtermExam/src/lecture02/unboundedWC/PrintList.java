package lecture02.unboundedWC;

import java.util.List;

public class PrintList {

	public static void printList1(List<Object> list) {
		for(Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
	
	public static void printList2(List<?> list) {
		for(Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
	
	public static void printList3(List list) {
		for(Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
}
