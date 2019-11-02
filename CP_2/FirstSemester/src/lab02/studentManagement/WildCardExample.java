package lab02.studentManagement;

import java.util.Arrays;

public class WildCardExample {

	public static void printCourse(Course<?> course) {
		System.out.println(course.getCourseName() + ", 수강생: "
				+ Arrays.toString(course.getStudent()));
	}
	
	public static void printStudentCourse(Course<? extends Student> course) {
		System.out.println(course.getCourseName() + ", 수강생: "
				+ Arrays.toString(course.getStudent()));
	}
	
	public static void printWorkerCourse(Course<? super Worker> course) {
		System.out.println(course.getCourseName() + ", 수강생: "
				+ Arrays.toString(course.getStudent()));
	}
	
	public static void main(String[] args) {
		Course<Person> courseForPerson = new Course<>("일반인과정", 4);
		courseForPerson.add(new Person("일반인"));
		courseForPerson.add(new Worker("직장인"));
		courseForPerson.add(new Student("학생"));
		courseForPerson.add(new HighStudent("고등학생"));
		Course<Worker> courseForWorker = new Course<>("직장인과정", 1);
		courseForWorker.add(new Worker("직장인"));
		Course<Student> courseForStudent = new Course<>("학생과정", 2);
		courseForStudent.add(new Student("학생"));
		courseForStudent.add(new HighStudent("고등학생"));
		Course<HighStudent> courseForHighStudent = new Course<>("고등학생과정", 1);
		courseForHighStudent.add(new HighStudent("고등학생"));
		
		printCourse(courseForPerson);
		printCourse(courseForWorker);
		printCourse(courseForStudent);
		printCourse(courseForHighStudent);
		System.out.println();
		
		// printStudentCourse(courseForPerson);
		// printStudentCourse(courseForWorker);
		printStudentCourse(courseForStudent);
		printStudentCourse(courseForHighStudent);
		System.out.println();
		
		printWorkerCourse(courseForPerson);
		printWorkerCourse(courseForWorker);
		// printWorkerCourse(courseForStudent);
		// printWorkerCourse(courseForHighStudent);
	}
}
