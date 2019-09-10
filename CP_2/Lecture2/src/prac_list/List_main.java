package prac_list;

public class List_main {
	
	public static void main(String[] args) {
		Item<String, String> i1 = new Item<>("박의수", "유정훈");
		Item<String, Integer> i2 = new Item<>("우리 방 비밀번호", 4480);
		
		List myList = new List(2);
		
		myList.addToList(i1);
		myList.addToList(i2);
		
		myList.printItem();
	}
}
