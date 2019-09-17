package oneHotEncoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringOneHot {

	private String str;
	private Set<String> strSet;
	private Map<Integer, String> strMap;
	private Map<String, ArrayList<Integer>> strOneHotVec;
	
	public StringOneHot(String str) {
		this.str = str;
		this.strSet = new TreeSet<>(); // 알파벳 순서대로 했는데, H, e, l, o가 알파벳 순서이면서 입력 순서라 애매함.
		this.strMap = new HashMap<>();
		this.strOneHotVec = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			strSet.add(Character.toString(str.charAt(i)));
		}
		
		Iterator<String> itr = strSet.iterator();
		
		int key = 0;
		while(itr.hasNext()) {
			String value = itr.next();
			strMap.put(key, value);
			strOneHotVec.put(value, getVec(strSet.size(), key));
			key++;
		}
	}
	
	ArrayList<Integer> getVec(int count, int index) {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		
		for(int i = 0; i < count; i++) {
			if(i == index) vector.add(1);
			else vector.add(0);
		}
		
		return vector;
	}

	String getString() {
		return str;
	}
	
	Set<String> getStrSet() {
		return strSet;
	}
	
	Map<Integer, String> getStrMap() {
		return strMap;
	}
	
	Map<String, ArrayList<Integer>> getStrOneHotVec() {
		return strOneHotVec;
	}
}
