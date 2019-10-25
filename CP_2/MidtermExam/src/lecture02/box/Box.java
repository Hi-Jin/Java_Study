package lecture02.box;

public class Box<T> {

	private T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}
}
