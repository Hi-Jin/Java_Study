package lab05.linkedList;

import lab04.arrayList.Iterator;
import lab04.arrayList.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < 20; i++) {
			list.addLast(i);
		}
		System.out.println(list);
		
		list.add(1, 20);
		System.out.println("list add(1, 20) = " + list);
	
		list.removeFirst();
		list.removeLast();
		System.out.println("list removeFirst and Last = " + list);
		
		list.set(3, 500);
		System.out.println("list set(3, 500) = " + list);
		
		System.out.println("list get(0) = " + list.get(0));
		
		System.out.println("list size = " + list.size());
		
		System.out.println("list indexOf(31) = " + list.indexOf(31));
		System.out.println("list indexOf(15) = " + list.indexOf(15));
		
		System.out.println("list isEmpty() = " + list.isEmpty());
		
		// 예외 발생 구문들
		// list.remove(19);
		// list.add(50, 30);
		// System.out.println(list.remove(50));
		
		list = new LinkedList<>();
		
		for(int i = 0; i < 100000; i++)
			list.addLast(i);
		long start = System.currentTimeMillis();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		long end = System.currentTimeMillis();
		
		double linkedListIteratorTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		end = System.currentTimeMillis();
		
		double linkedListGetTime = (end - start) / 1000.0;
		
		System.out.println("LinkedList - Iterator = " + linkedListIteratorTime + "초");
		System.out.println("LinkedList - For & Get() = " + linkedListGetTime + "초");
	}
}
