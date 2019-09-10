package box_generic;

public class Box_main {
	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		
		Box<Integer> b2 = new Box<Integer>();
		
		// b1.set(new Integer(10)); // Error msg!
	}
}
