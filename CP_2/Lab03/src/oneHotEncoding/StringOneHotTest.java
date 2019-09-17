package oneHotEncoding;

public class StringOneHotTest {

	public static void main(String[] args) {
		String str = "Apple";
		StringOneHot soh = new StringOneHot(str);
		System.out.println("문자열: " + soh.getString());
		System.out.println("문자열 Set: " + soh.getStrSet());
		System.out.println("문자열 Map: " + soh.getStrMap());
		System.out.println("문자열 One-hot Vector: " + soh.getStrOneHotVec());
		
		System.out.println("One-hot Vector로 나타낸 " + soh.getString());
		for(int i = 0; i < str.length(); i++) {
			System.out.println(soh.getStrOneHotVec().get(str.substring(i, i+1)));
		}
	}
}
