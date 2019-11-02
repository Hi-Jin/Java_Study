package lab03.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lab03.map.Student;

public class SortTest {

	public static void main(String[] args) {
		Student array[] = {
				new Student(20190021, "하나"), 
				new Student(20190043, "준영"), 
				new Student(20190019, "형근"), 
				new Student(20190033, "지수")
		};
		
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}
}
