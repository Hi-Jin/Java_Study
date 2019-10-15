package arrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(1);
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
		list.remove(19);
		// list.add(50, 30);
		// System.out.println(list.remove(50));
	}
}
