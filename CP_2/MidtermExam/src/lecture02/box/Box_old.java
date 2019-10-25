/*
 * 제네릭으로 작성시 재사용성읋 높일 수 있음
 * => 타입별로 새로운 클래스를 만들지 않아도 되기 때문이다.
 * ; 컬렉션 라이브러리에 많이 사용.
 */
package lecture02.box;

public class Box_old {

	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}
