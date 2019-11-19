package lab11.filter;

public class Apple {

	private String name;
	private Colors color;
	
	public Apple() {}
	
	public Apple(String name, Colors color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Colors getColor() {
		return color;
	}
	
	public void setColor(Colors color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + "]";
	}
}
