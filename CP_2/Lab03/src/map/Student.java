package map;

public class Student implements Comparable<Student> {

	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Student s) {
		return number - s.number;
	}
}
