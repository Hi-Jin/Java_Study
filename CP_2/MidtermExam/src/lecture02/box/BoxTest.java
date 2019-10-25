/*
 * 프로그램이 실행되어 객체 생성되기 전까지, Box_old 클래스는 Object타입이기 때문에 
 * box에 담긴 데이터가 어떤 타입인지 알 수 없다.
 * 따라서 Box_old를 이용하면, 컴파일 타임에 잡을 수 있는 에러를 런타임까지 발견하지 못 할 수 있고, 
 * 이는 큰 문제가 된다.
 */
package lecture02.box;

public class BoxTest {

	public static void main(String[] args) {
		Box_old box1 = new Box_old();
		Box<Integer> box2 = new Box<>();
		Box<Object> box3 = new Box<>();
		Box box4 = new Box(); // raw type으로 작성되어 warning을 띄우는 모습.
		
		box1.set(new Integer(10));
		String s1 = (String)box1.get(); // error (런타임 에러)
		
		box2.set(new Integer(10));
		String s2 = (String)box2.get(); // error (컴파일 에러)
		
		box3.set(new Integer(10));
		String s3 = (String)box3.get(); // error (런타임 에러)
		
		box4.set(new Integer(10));
		String s4 = (String)box4.get(); // error (런타임 에러)
	}
}
