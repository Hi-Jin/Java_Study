package lab03.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<>();
		
		st.put("20190001", new Student(20190001, "유비"));
		st.put("20190002", new Student(20190002, "관우"));
		st.put("20190003", new Student(20190003, "장비"));
		
		System.out.println(st);
		
		st.remove("20190002");
		
		st.put("20190003",  new Student(20190003, "조운"));
		
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
	}
}
