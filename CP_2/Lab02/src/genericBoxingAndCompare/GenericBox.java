package genericBoxingAndCompare;

public class GenericBox<T> {

	T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}
}
