package generic;

public class RunTimeErrExam {

	public static void main(String[] args) {
		Box b = new Box();
		b.set(new Integer(10));
		b.set("Hello World!");
		String s = (String)b.get();
		Integer i = (Integer)b.get();
	}
}


class Box {
	
	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}