package lab11.filter;

import java.util.Arrays;
import java.util.List;

public class ExampleTest {

	public static void main(String[] args) {
		List<Apple> list = Arrays.asList(
				new Apple("1번 사과", Colors.GREEN),
				new Apple("2번 사과", Colors.RED),
				new Apple("3번 사과", Colors.YELLOW),
				new Apple("4번 사과", Colors.GREEN),
				new Apple("5번 사과", Colors.RED),
				new Apple("6번 사과", Colors.GREEN),
				new Apple("7번 사과", Colors.RED),
				new Apple("8번 사과", Colors.YELLOW),
				new Apple("9번 사과", Colors.GREEN),
				new Apple("10번 사과", Colors.RED)
		);
		
		FilterUtils myFilter = new FilterUtils();
		List<Apple> redAppleList = myFilter.filter(list, apple -> apple.getColor() == Colors.RED);
		
		for(Apple apple : redAppleList) {
			System.out.println(apple);
		}
	}
}
