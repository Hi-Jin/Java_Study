package lab05.linkedList;

import lab04.arrayList.List;
import lab04.arrayList.ArrayList;

public class ListTimeTest {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>(1);
		List<Integer> linkedList = new LinkedList<>();
		
		long start, end;
		double arrayListAddLastTime, linkedListAddLastTime, arrayListAddFirstTime, 
			linkedListAddFirstTime, arrayListRandomAddTime, linkedListRandomAddTime, 
			arrayListFindTime, linkedListFindTime, arrayListRemoveTime, linkedListRemoveTime;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			arrayList.addLast(i);
		end = System.currentTimeMillis();
		arrayListAddLastTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			linkedList.addLast(i);
		end = System.currentTimeMillis();
		linkedListAddLastTime = (end - start) / 1000.0;
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			arrayList.addFirst(i);
		end = System.currentTimeMillis();
		arrayListAddFirstTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			linkedList.addFirst(i);
		end = System.currentTimeMillis();
		linkedListAddFirstTime = (end - start) / 1000.0;
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			arrayList.add((int)Math.random()*arrayList.size(), -1);
		end = System.currentTimeMillis();
		arrayListRandomAddTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			linkedList.add((int)Math.random()*linkedList.size(), -1);
		end = System.currentTimeMillis();
		linkedListRandomAddTime = (end - start) / 1000.0;
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			arrayList.get((int)Math.random()*arrayList.size());
		end = System.currentTimeMillis();
		arrayListFindTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			linkedList.get((int)Math.random()*linkedList.size());
		end = System.currentTimeMillis();
		linkedListFindTime = (end - start) / 1000.0;
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			arrayList.remove((int)Math.random()*arrayList.size());
		end = System.currentTimeMillis();
		arrayListRemoveTime = (end - start) / 1000.0;
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			linkedList.remove((int)Math.random()*linkedList.size());
		end = System.currentTimeMillis();
		linkedListRemoveTime = (end - start) / 1000.0;
		
		
		System.out.println("arrayList vs linkedList");
		System.out.println("(size : " + arrayList.size() + " : " + linkedList.size() + ")");
		System.out.println("AddLast : " + arrayListAddLastTime + " : " + linkedListAddLastTime);
		System.out.println("AddFirst : " + arrayListAddFirstTime + " : " + linkedListAddFirstTime);
		System.out.println("RandomAdd : " + arrayListRandomAddTime + " : " + linkedListRandomAddTime);
		System.out.println("FindTime : " + arrayListFindTime + " : " + linkedListFindTime);
		System.out.println("RemoveTime : " + arrayListRemoveTime + " : " + linkedListRemoveTime);
		System.out.println("arrayList와 linkedList의 시간 차이는 "
				+ "arrayList의 index를 밀어내는 부분에서 생기는 것이다.\n"
				+ "AddLast의 경우에는 index 끝에 삽입하는 것이기 때문에,index를 밀어내는 작업이 일어나지 않아서 "
				+ "큰 차이가 나지 않지만, \nAddFirst를 arrayList에서 실행하면 모든 index를 한 칸씩 뒤로 밀어야 해서"
				+ " linkedList와 큰 성능 차이가 보인다.");
	}
}
