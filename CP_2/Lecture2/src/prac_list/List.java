package prac_list;

public class List {
	
	private Item<?, ?>[] myList;
	private int itemNumber = 0;
	
	public List(int length) {
		this.myList = new Item[length];
	}
	
	public void printItem() {
		for(int i = 0; i < this.myList.length; i++) {
			System.out.println(myList[i].getKey() + " = " + myList[i].getValue());
		}
	}
	
	public void addToList(Item<?, ?> item) {
		this.myList[itemNumber] = item;
		itemNumber++;
	}
}

class Item<K, V> {
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public Item(K key, V value) {
		this.key = key;
		this.value = value;
	}
}