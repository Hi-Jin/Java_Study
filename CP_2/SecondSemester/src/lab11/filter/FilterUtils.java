package lab11.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {

	public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredResult = new ArrayList<>();
		for (T type : list) {
			if(predicate.test(type)) {
				filteredResult.add(type);
			}
		}
		
		return filteredResult;
	}
}
