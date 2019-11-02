package lab02.genericBoxingAndCompare;

public class BoxingGenericMethodTest {
	
	public static void main(String[] args) {
		GenericBox<Integer> box1 = Utility.boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		GenericBox<String> box2 = Utility.boxing("제네릭 메소드");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
