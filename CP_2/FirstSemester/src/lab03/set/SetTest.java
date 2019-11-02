package lab03.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("milk");
		set.add("bread");
		set.add("butter");
		set.add("cheese");
		set.add("milk");
		set.add("butter");
		
		System.out.println(set);
	}
}
