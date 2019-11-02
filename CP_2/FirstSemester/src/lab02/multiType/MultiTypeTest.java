package lab02.multiType;

public class MultiTypeTest {
	
	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println("Key of p1 = " + p1.getKey());
		System.out.println("Value of p1 = " + p1.getKey());
		
		OrderedPair<String, String> p2 = new OrderedPair<>("Hello", "World");
		System.out.println("Key of p2 = " + p2.getKey());
		System.out.println("Value of p2 = " + p2.getValue());
	}
}
