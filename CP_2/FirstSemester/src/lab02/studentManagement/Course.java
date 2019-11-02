 package lab02.studentManagement;

public class Course<T> {

	private String courseName;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		this.students = (T[]) new Object[capacity];
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public T[] getStudent() {
		return students;
	}
	
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
