package lecture03.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Object> vc = new Vector<>();
		
		vc.add("Hello World");
		vc.add(1);
		vc.add(new Integer(3));
		
		Vector<Integer> vc2 = new Vector<>();
		vc2.add(1);
		// vc2.add("hi");
		
		String s = (String) vc.get(1); // 런타임 에러 발생 (Object나 raw타입 모두)
		// s = (String) vc2.get(0);
	}
}
