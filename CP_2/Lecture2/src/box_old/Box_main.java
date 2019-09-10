package box_old;

public class Box_main {
	
	public static void main(String[] args) {
		Box b = new Box();
		b.set(new Integer(10));
		b.set("Hello World!");
		String s = (String)b.get();
		
		System.out.println(s);
	}
	
}
